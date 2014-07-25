package com.android.reverse.mod;

import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;
import android.content.pm.ApplicationInfo;

public class PackageMetaInfo {
	
	private String packageName;
	private String processName;
	private ClassLoader classLoader;
	private ApplicationInfo appInfo;
	private boolean isFirstApplication;
	
	public static PackageMetaInfo fromXposed(LoadPackageParam lpparam){
		PackageMetaInfo pminfo = new PackageMetaInfo();
		pminfo.packageName = lpparam.packageName;
		pminfo.processName = lpparam.processName;
		pminfo.classLoader = lpparam.classLoader;
		pminfo.appInfo = lpparam.appInfo;
		pminfo.isFirstApplication = lpparam.isFirstApplication;
		return pminfo;
		
	}

	public String getPackageName() {
		return packageName;
	}

	public String getProcessName() {
		return processName;
	}

	public ClassLoader getClassLoader() {
		return classLoader;
	}

	public ApplicationInfo getAppInfo() {
		return appInfo;
	}

	public boolean isFirstApplication() {
		return isFirstApplication;
	}
	
	

}
