package com.android.reverse.request;

import com.android.reverse.collecter.LuaScriptInvoker;
import com.android.reverse.util.Logger;

public class InvokeScriptCommandHandler implements CommandHandler {

	private String script;
	private String filePath;
	private ScriptType type;

	public static enum ScriptType {
		TEXTTYPE, FILETYPE
	}

	public InvokeScriptCommandHandler(String str, ScriptType type) {
		this.type = type;
		if (type == ScriptType.TEXTTYPE)
			this.script = str;
		else if (type == ScriptType.FILETYPE)
			this.filePath = str;
	}

	@Override
	public void doAction() {
		Logger.log("The Script invoke start");
		if (this.type == ScriptType.TEXTTYPE) {
			LuaScriptInvoker.getInstance().invokeScript(script);
		} else if (this.type == ScriptType.FILETYPE) {
			LuaScriptInvoker.getInstance().invokeFileScript(filePath);
		} else {
			Logger.log("the script type is invalid");
		}
		Logger.log("The Script invoke end");

	}

}
