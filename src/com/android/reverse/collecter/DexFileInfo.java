package com.android.reverse.collecter;

public class DexFileInfo {
	
	private String dexPath;
	private int mCookie;
	private ClassLoader defineClassLoader;

	
	public DexFileInfo(String dexPath,int mCookie) {
		super();
		this.dexPath = dexPath;
		this.mCookie = mCookie;
	}
	
	public DexFileInfo(String dexPath,int mCookie,ClassLoader classLoader) {
		this(dexPath,mCookie);
		this.defineClassLoader = classLoader;
	}
	
	public String getDexPath() {
		return dexPath;
	}

	public int getmCookie() {
		return mCookie;
	}

	public void setmCookie(int mCookie) {
		this.mCookie = mCookie;
	}

	public ClassLoader getDefineClassLoader() {
		return defineClassLoader;
	}

	public void setDefineClassLoader(ClassLoader defineClassLoader) {
		this.defineClassLoader = defineClassLoader;
	}

	public void setDexPath(String dexPath) {
		this.dexPath = dexPath;
	}



}
