package com.android.reverse.apimonitor;

import java.io.File;
import java.lang.reflect.Method;

import com.android.reverse.hook.HookParam;
import com.android.reverse.util.Logger;
import com.android.reverse.util.RefInvoke;

public class RuntimeHook extends ApiMonitorHook {

	@Override
	public void startHook() {

		Method execmethod = RefInvoke.findMethodExact(
				"java.lang.Runtime", ClassLoader.getSystemClassLoader(),
				"exec", String[].class,String[].class,File.class);
		hookhelper.hookMethod(execmethod, new AbstractBahaviorHookCallBack() {			
			@Override
			public void descParam(HookParam param) {
				// TODO Auto-generated method stub
				Logger.log_behavior("Create New Process ->");
				String[] progs = (String[]) param.args[0];
				for(int i=0 ;i <progs.length; i++){
				   Logger.log_behavior("Command" + i + " = "+progs[i]);
				}
			}
		});
		
	}

}
