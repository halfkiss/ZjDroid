package com.android.reverse.util;

import android.util.Log;

public class Logger {
	
	public static String LOGTAG_COMMAN = "zjdroid-shell-";
	public static String LOGTAG_WORKFLOW = "zjdroid-apimonitor-";
	public static boolean DEBUG_ENABLE = true;
	public static String PACKAGENAME;
	
	public static void log(String message){
		if(DEBUG_ENABLE)
			Log.d(LOGTAG_COMMAN+PACKAGENAME,message);
	}
	
	public static void log_behavior(String message){
		if(DEBUG_ENABLE)
			Log.d(LOGTAG_WORKFLOW+PACKAGENAME,message);
	}
	
}
