package com.android.reverse.collecter;

import java.lang.reflect.Method;
import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

import com.android.reverse.hook.HookHelperFacktory;
import com.android.reverse.hook.HookHelperInterface;
import com.android.reverse.hook.HookParam;
import com.android.reverse.hook.MethodHookCallBack;
import com.android.reverse.util.JsonWriter;
import com.android.reverse.util.Logger;
import com.android.reverse.util.RefInvoke;

public class LuaScriptInvoker{
	
	private static LuaScriptInvoker luaInvoker;
	private final static String LUAJAVA_LIB = "luajava";
	private HookHelperInterface hookhelper = HookHelperFacktory.getHookHelper();

	
	private LuaScriptInvoker(){
		
	}
	
	
	public static LuaScriptInvoker getInstance(){
		if(luaInvoker == null)
			luaInvoker = new LuaScriptInvoker();
		return luaInvoker;
	}
	
	public void start(){
		Method findLibraryMethod = RefInvoke.findMethodExact("dalvik.system.BaseDexClassLoader", ClassLoader.getSystemClassLoader(), "findLibrary",
				String.class);
		hookhelper.hookMethod(findLibraryMethod, new MethodHookCallBack() {

			@Override
			public void beforeHookedMethod(HookParam param) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterHookedMethod(HookParam param) {
				Logger.log((String) param.args[0]);
				if (LUAJAVA_LIB.equals(param.args[0]) && param.getResult() == null) {
					param.setResult("/data/data/com.android.reverse/lib/libluajava.so");
				}
			}
		});
		
	}
	
	private void initLuaContext(LuaState luaState){
		try {
			JavaFunction logfunction = new LogFunctionCallBack(luaState);
			logfunction.register("log");
			JavaFunction tostringfunction = new ToStringFunctionCallBack(luaState);
			tostringfunction.register("tostring");
		} catch (LuaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void invokeScript(String script){
		LuaState luaState = LuaStateFactory.newLuaState();
		luaState.openLibs();
		this.initLuaContext(luaState);
		int error = luaState.LdoString(script);
		if(error!=0){
			Logger.log("Read/Parse lua error. Exit");
			return;
		}
		
		luaState.close();
	}
	
	public void invokeFileScript(String scriptFilePath){
		LuaState luaState = LuaStateFactory.newLuaState();
		luaState.openLibs();
		this.initLuaContext(luaState);
		int error = luaState.LdoFile(scriptFilePath);
		if(error!=0){
			Logger.log("Read/Parse lua error. Exit");
			return;
		}
		luaState.close();
	}
	
	public static class ToStringFunctionCallBack extends JavaFunction{

		public ToStringFunctionCallBack(LuaState L) {
			super(L);
		}

		@Override
		public int execute() throws LuaException {
			
			int param_size = this.L.getTop();
			for(int i=2; i<=param_size; i++){
				try {
					String objDsrc = JsonWriter.parserInstanceToJson(this.getParam(i).getObject());
					Logger.log(objDsrc);
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}
			return 0;
		}
		
	}
	
	public static class LogFunctionCallBack extends JavaFunction{

		public LogFunctionCallBack(LuaState L) {
			super(L);
		}

		@Override
		public int execute() throws LuaException {
			
			int param_size = this.L.getTop();
			if(param_size ==2 ){
				String message = this.L.getLuaObject(2).getString();
				Logger.log(message);
			}
			
			return 0;
		}
		
	}
	
	

}
