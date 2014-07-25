package com.android.reverse.collecter;

import java.util.HashMap;
import java.util.Iterator;

import com.android.reverse.util.Logger;
import com.android.reverse.util.NativeFunction;

public class NativeHookCollecter{

	private static NativeHookCollecter collecter;
	private static HashMap<String, HashMap<String, Integer>> initSysLinkInfo;

	private NativeHookCollecter() {

	}

	public static NativeHookCollecter getInstance() {
		if (collecter == null) {
			collecter = new NativeHookCollecter();
		}
		return collecter;
	}

	public void init() {
		if(initSysLinkInfo == null)
			initSysLinkInfo = NativeFunction.getSyslinkSnapshot();
	}

	public void parserNativeHookInfo() {
		Logger.log("The parser native hook info start");
		if (initSysLinkInfo == null) {
			Logger.log("the init syslink info == null");
			return;
		}

		int hookcount =0;
		HashMap<String, HashMap<String, Integer>> currentInfo = NativeFunction
				.getSyslinkSnapshot();
		Iterator<String> libkeys = currentInfo.keySet().iterator();
		HashMap<String, Integer> currentlinks;
		HashMap<String, Integer> initlinks;
		while (libkeys.hasNext()) {
			String libName = libkeys.next();
			if (initSysLinkInfo.containsKey(libName)) {
				currentlinks = currentInfo.get(libName);
				initlinks = initSysLinkInfo.get(libName);
				Iterator<String> sysNamekeys = currentlinks.keySet().iterator();
				while (sysNamekeys.hasNext()) {
					String sysName = sysNamekeys.next();
					if (initlinks.containsKey(sysName)) {
						int currentAddr = currentlinks.get(sysName);
						int initAddr = initlinks.get(sysName);
						if (currentAddr != initAddr) {
							Logger.log("The " + libName + " syslink:" + sysName
									+ " oldAddr:" + initAddr + " newAddr:"
									+ currentAddr);
							hookcount++;
						} 
						
					}
				}
			}
		}
		if(hookcount == 0 ){
			Logger.log("the app can't hook native function");
		}else{
			Logger.log("The app total hook native function = "+hookcount);
		}
		Logger.log("The parser native hook info end");
	}

}
