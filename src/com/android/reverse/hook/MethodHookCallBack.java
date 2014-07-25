package com.android.reverse.hook;

import de.robv.android.xposed.XC_MethodHook;

public abstract class MethodHookCallBack extends XC_MethodHook {
	
	@Override
	protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
		// TODO Auto-generated method stub
		super.beforeHookedMethod(param);
		HookParam hookParam = HookParam.fromXposed(param);
		this.beforeHookedMethod(hookParam);
		if(hookParam.hasResult())
			param.setResult(hookParam.getResult());
	}

	@Override
	protected void afterHookedMethod(MethodHookParam param) throws Throwable {
		// TODO Auto-generated method stub
		super.afterHookedMethod(param);
		HookParam hookParam = HookParam.fromXposed(param);
		this.afterHookedMethod(hookParam);
		if(hookParam.hasResult())
			param.setResult(hookParam.getResult());
	}
	
	public abstract void beforeHookedMethod(HookParam param);
	public abstract void afterHookedMethod(HookParam param);

}
