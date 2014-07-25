package com.android.reverse.request;

import com.android.reverse.collecter.HeapDump;
import com.android.reverse.collecter.ModuleContext;
import com.android.reverse.util.Logger;

public class DumpHeapCommandHandler implements CommandHandler {
	
	private static String dumpFileName;

	public DumpHeapCommandHandler() {
		dumpFileName = android.os.Process.myPid()+".hprof";
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		String heapfilePath =ModuleContext.getInstance().getAppContext().getFilesDir()+"/"+dumpFileName;
        HeapDump.dumpHeap(heapfilePath);
        Logger.log("the heap data save to ="+ heapfilePath);
	}
	
	

}
