package com.android.reverse.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Utility {

	public static int getApiLevel() {

		try {
			Class<?> mClassType = Class.forName("android.os.SystemProperties");
			Method mGetIntMethod = mClassType.getDeclaredMethod("getInt",
					String.class, int.class);
			mGetIntMethod.setAccessible(true);
			return (Integer)mGetIntMethod.invoke(null, "ro.build.version.sdk",14);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 14;

	}

}
