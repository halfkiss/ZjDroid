package com.android.reverse.request;


import com.android.reverse.collecter.NativeHookCollecter;

public class NativeHookInfoHandler implements CommandHandler {

	@Override
	public void doAction() {
        NativeHookCollecter.getInstance().parserNativeHookInfo();
	}

}
