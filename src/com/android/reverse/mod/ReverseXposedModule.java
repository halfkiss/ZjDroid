package com.android.reverse.mod;

import android.content.pm.ApplicationInfo;

import com.android.reverse.apimonitor.ApiMonitorHookManager;
import com.android.reverse.collecter.DexFileInfoCollecter;
import com.android.reverse.collecter.LuaScriptInvoker;
import com.android.reverse.collecter.ModuleContext;
import com.android.reverse.util.Logger;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class ReverseXposedModule implements IXposedHookLoadPackage {

	private static final String ZJDROID_PACKAGENAME = "com.android.reverse"; 
	@Override
	public void handleLoadPackage(LoadPackageParam lpparam) throws Throwable {
		// TODO Auto-generated method stub
		if(lpparam.appInfo == null || 
				(lpparam.appInfo.flags & (ApplicationInfo.FLAG_SYSTEM | ApplicationInfo.FLAG_UPDATED_SYSTEM_APP)) !=0){
			return;
		}else if(lpparam.isFirstApplication && !ZJDROID_PACKAGENAME.equals(lpparam.packageName)){
		  Logger.PACKAGENAME = lpparam.packageName;
		  Logger.log("the package = "+lpparam.packageName +" has hook");
		  Logger.log("the app target id = "+android.os.Process.myPid());
		  PackageMetaInfo pminfo = PackageMetaInfo.fromXposed(lpparam);
		  ModuleContext.getInstance().initModuleContext(pminfo);
		  DexFileInfoCollecter.getInstance().start();
		  LuaScriptInvoker.getInstance().start();
		  ApiMonitorHookManager.getInstance().startMonitor();
		}else{
			
		}
	}

}
