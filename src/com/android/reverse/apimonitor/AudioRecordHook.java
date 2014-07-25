package com.android.reverse.apimonitor;

import java.lang.reflect.Method;

import android.media.MediaSyncEvent;

import com.android.reverse.hook.HookParam;
import com.android.reverse.util.Logger;
import com.android.reverse.util.RefInvoke;

public class AudioRecordHook extends ApiMonitorHook {

	@Override
	public void startHook() {
		// TODO Auto-generated method stub
		Method startRecordingMethod = RefInvoke.findMethodExact(
				"android.media.AudioRecord", ClassLoader.getSystemClassLoader(),
				"startRecording");
		hookhelper.hookMethod(startRecordingMethod, new AbstractBahaviorHookCallBack() {
			
			@Override
			public void descParam(HookParam param) {
				// TODO Auto-generated method stub
				Logger.log_behavior("Audio Recording ->");
			}
		});
		
		Method startRecordingWithSyncMethod = RefInvoke.findMethodExact(
				"android.media.AudioRecord", ClassLoader.getSystemClassLoader(),
				"startRecording",MediaSyncEvent.class);
		hookhelper.hookMethod(startRecordingWithSyncMethod, new AbstractBahaviorHookCallBack() {
			
			@Override
			public void descParam(HookParam param) {
				// TODO Auto-generated method stub
				Logger.log_behavior("Audio Recording ->");
			}
		});
	}

}
