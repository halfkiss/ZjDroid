package com.android.reverse.hook;

import java.lang.reflect.Member;


import de.robv.android.xposed.XposedBridge;

public class XposeHookHelperImpl implements HookHelperInterface {

	@Override
	public void hookMethod(Member method, MethodHookCallBack callback) {
		// TODO Auto-generated method stub
		XposedBridge.hookMethod(method, callback);
	}

}
