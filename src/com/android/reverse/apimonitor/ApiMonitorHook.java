package com.android.reverse.apimonitor;


import com.android.reverse.hook.HookHelperFacktory;
import com.android.reverse.hook.HookHelperInterface;

public abstract class ApiMonitorHook {
	
   protected HookHelperInterface hookhelper = HookHelperFacktory.getHookHelper();
   public static class InvokeInfo{
	   private long invokeAtTime;
	   private String className;
	   private String methodName;
	   private Object[] argv;
	   private Object result;
	   private Object invokeState;
   }
   public abstract void startHook();
    
}
