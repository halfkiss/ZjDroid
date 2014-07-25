package com.android.reverse.hook;

public class HookHelperFacktory {
	
	private static HookHelperInterface hookHelper;
	
	public static HookHelperInterface getHookHelper(){
		if(hookHelper == null)
			hookHelper = new XposeHookHelperImpl();
		return hookHelper;
	}

}
