package com.android.reverse.hook;

import java.lang.reflect.Member;


public interface HookHelperInterface {
	
	public abstract void hookMethod(Member method, MethodHookCallBack callback);

}
