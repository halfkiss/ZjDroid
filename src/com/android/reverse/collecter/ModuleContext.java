package com.android.reverse.collecter;

import java.lang.reflect.Method;

import com.android.reverse.hook.HookHelperFacktory;
import com.android.reverse.hook.HookHelperInterface;
import com.android.reverse.hook.HookParam;
import com.android.reverse.hook.MethodHookCallBack;
import com.android.reverse.mod.CommandBroadcastReceiver;
import com.android.reverse.mod.PackageMetaInfo;
import com.android.reverse.util.Utility;
import android.app.Application;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;

public class ModuleContext {


    private PackageMetaInfo metaInfo;
	private int apiLevel;
	private boolean HAS_REGISTER_LISENER = false;
	private Application fristApplication;
	private static ModuleContext moduleContext;
	private HookHelperInterface hookhelper = HookHelperFacktory.getHookHelper();


	private ModuleContext() {
        this.apiLevel = Utility.getApiLevel();
	}

	public static ModuleContext getInstance() {
		if (moduleContext == null)
			moduleContext = new ModuleContext();
		return moduleContext;
	}

	public void initModuleContext(PackageMetaInfo info) {
		this.metaInfo = info;
		String appClassName = this.getAppInfo().className;
		if (appClassName == null) {
			Method hookOncreateMethod = null;
			try {
				hookOncreateMethod = Application.class.getDeclaredMethod("onCreate", new Class[] {});
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hookhelper.hookMethod(hookOncreateMethod, new ApplicationOnCreateHook());

		} else {
			Class<?> hook_application_class = null;
			try {
				hook_application_class = this.getBaseClassLoader().loadClass(appClassName);
				if (hook_application_class != null) {
					Method hookOncreateMethod = hook_application_class.getDeclaredMethod("onCreate", new Class[] {});
					if (hookOncreateMethod != null) {
						hookhelper.hookMethod(hookOncreateMethod, new ApplicationOnCreateHook());
					}
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				Method hookOncreateMethod;
				try {
					hookOncreateMethod = Application.class.getDeclaredMethod("onCreate", new Class[] {});
					if (hookOncreateMethod != null) {
						hookhelper.hookMethod(hookOncreateMethod, new ApplicationOnCreateHook());
					}
				} catch (NoSuchMethodException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		}
	}

	public String getPackageName() {
		return metaInfo.getPackageName();
	}

	public String getProcssName() {
		return metaInfo.getProcessName();
	}

	public ApplicationInfo getAppInfo() {
		return metaInfo.getAppInfo();
	}

	public Application getAppContext() {
		return this.fristApplication;
	}

	public int getApiLevel() {
		return this.apiLevel;
	}
	
	public String getLibPath(){
		return this.metaInfo.getAppInfo().nativeLibraryDir;
	}
	
	public ClassLoader getBaseClassLoader(){
		return this.metaInfo.getClassLoader();
	}

	private class ApplicationOnCreateHook extends MethodHookCallBack {

		@Override
		public void beforeHookedMethod(HookParam param) {
			// TODO Auto-generated method stub

		}

		@Override
		public void afterHookedMethod(HookParam param) {
			// TODO Auto-generated method stub
			if (!HAS_REGISTER_LISENER) {
				fristApplication = (Application) param.thisObject;
				IntentFilter filter = new IntentFilter(CommandBroadcastReceiver.INTENT_ACTION);
				fristApplication.registerReceiver(new CommandBroadcastReceiver(), filter);
				HAS_REGISTER_LISENER = true;
			}
		}

	}

}
