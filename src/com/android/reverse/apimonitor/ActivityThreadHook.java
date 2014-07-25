package com.android.reverse.apimonitor;

import java.lang.reflect.Method;
import com.android.reverse.hook.HookParam;
import com.android.reverse.util.Logger;
import com.android.reverse.util.RefInvoke;

public class ActivityThreadHook extends ApiMonitorHook {

	@Override
	public void startHook() {
		// TODO Auto-generated method stub
		try {
			Class receiverDataClass = Class.forName("android.app.ActivityThread$ReceiverData");
			if (receiverDataClass != null) {
				Method handleReceiverMethod = RefInvoke.findMethodExact("android.app.ActivityThread", ClassLoader.getSystemClassLoader(),
						"handleReceiver", receiverDataClass);
				hookhelper.hookMethod(handleReceiverMethod, new AbstractBahaviorHookCallBack() {

					@Override
					public void descParam(HookParam param) {
						Logger.log_behavior("The Receiver Information:");
						Object data = param.args[0];
						Logger.log_behavior(data.toString());
						
					}
				});
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
