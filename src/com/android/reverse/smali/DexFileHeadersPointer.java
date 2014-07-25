package com.android.reverse.smali;

public class DexFileHeadersPointer {
	
    private  int  baseAddr;
    private  int  pStringIds;
    private  int  pTypeIds;
    private  int  pFieldIds;
    private  int  pMethodIds;
    private  int  pProtoIds;
    private  int  pClassDefs;
    private  int  classCount;
    
	public int getClassCount() {
		return classCount;
	}
	public void setClassCount(int classCount) {
		this.classCount = classCount;
	}
	public void setBaseAddr(int baseAddr) {
		this.baseAddr = baseAddr;
	}
	public void setpStringIds(int pStringIds) {
		this.pStringIds = pStringIds;
	}
	public void setpTypeIds(int pTypeIds) {
		this.pTypeIds = pTypeIds;
	}
	public void setpFieldIds(int pFieldIds) {
		this.pFieldIds = pFieldIds;
	}
	public void setpMethodIds(int pMethodIds) {
		this.pMethodIds = pMethodIds;
	}
	public void setpProtoIds(int pProtoIds) {
		this.pProtoIds = pProtoIds;
	}
	public void setpClassDefs(int pClassDefs) {
		this.pClassDefs = pClassDefs;
	}
	public int getBaseAddr() {
		return baseAddr;
	}
	public int getpStringIds() {
		return pStringIds;
	}
	public int getpTypeIds() {
		return pTypeIds;
	}
	public int getpFieldIds() {
		return pFieldIds;
	}
	public int getpMethodIds() {
		return pMethodIds;
	}
	public int getpProtoIds() {
		return pProtoIds;
	}
	public int getpClassDefs() {
		return pClassDefs;
	}
	
	public String toString(){
		return "baseAddr:"+baseAddr+";pStringIds:"+pStringIds +";pTypeIds:"+pTypeIds+";pFieldIds:"+pFieldIds+";pMethodIds:"+pMethodIds+";pProtoIds:"+pProtoIds+";pClassDefs:"+pClassDefs;
	}

}
