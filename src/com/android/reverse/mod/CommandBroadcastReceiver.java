package com.android.reverse.mod;

import java.util.List;

import com.android.reverse.request.CommandHandler;
import com.android.reverse.request.CommandHandlerParser;
import com.android.reverse.util.Logger;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CommandBroadcastReceiver extends BroadcastReceiver {

	public static String INTENT_ACTION = "com.zjdroid.invoke";
	public static String TARGET_KEY = "target";
	public static String COMMAND_NAME_KEY = "cmd";

	@Override
	public void onReceive(final Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		if (INTENT_ACTION.equals(arg1.getAction())) {
			try {
				int pid = arg1.getIntExtra(TARGET_KEY, 0);
				if (pid == android.os.Process.myPid()) {
					String cmd = arg1.getStringExtra(COMMAND_NAME_KEY);
					final CommandHandler handler = CommandHandlerParser
							.parserCommand(cmd);
					if (handler != null) {
						new Thread(new Runnable() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								handler.doAction();
							}
						}).start();
					}else{
						Logger.log("the cmd is invalid");
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
