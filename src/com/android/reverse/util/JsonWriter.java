package com.android.reverse.util;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonWriter {

	public static String parserInstanceToJson(Object data) throws Exception {

		if (data.getClass().isPrimitive() || isSimpleType(data)) {
			return data.toString();
		}
		JSONObject result = new JSONObject();
		Field[] fields = data.getClass().getDeclaredFields();
		Field field = null;
		for (int i = 0; i < fields.length; i++) {
			field = fields[i];
			field.setAccessible(true);
			Object value = field.get(data);
			if (field.getType().isPrimitive()) {
				result.put(field.getName(), value);
			} else {
				if (isSimpleType(value)) {
					result.put(field.getName(), value);
				} else if (value == null) {
					result.put(field.getName(), null);
				} else if (isSimpleTypeArray(value)) {
					JSONArray arrayData = new JSONArray();
					Object[] objArray = (Object[]) value;
					if (objArray != null) {
						for (int j = 0; j < objArray.length; j++) {
							arrayData.put(objArray[j]);
						}
					}
					result.put(field.getName(), arrayData);
				} else if (value instanceof Object[]) {
					JSONArray arrayData = new JSONArray();
					Object[] objArray = (Object[]) value;
					for (int j = 0; j < objArray.length; j++) {
						arrayData.put(parserInstanceToJson(objArray[j]));
					}
					result.put(field.getName(), arrayData);
				} else if (value instanceof Collection) {
					JSONArray arrayData = new JSONArray();
					Object[] objArray = ((Collection) value).toArray();
					for (int j = 0; j < objArray.length; j++) {
						if (isSimpleType(objArray[j]))
							arrayData.put(objArray[j]);
						else
							arrayData.put(parserInstanceToJson(objArray[j]));
					}
					result.put(field.getName(), arrayData);
				} else if (value instanceof Map) {
					JSONArray arrayData = new JSONArray();
					Map map = (Map) value;
					Object[] keyArray = map.keySet().toArray();
					for (int j = 0; j < keyArray.length; j++) {
						JSONObject obj = new JSONObject();
						obj.put("key", parserInstanceToJson(keyArray[j]));
						obj.put("value", parserInstanceToJson(map.get(keyArray[j])));
						arrayData.put(obj);
					}
					result.put(field.getName(), arrayData);
				}

				else if (value instanceof Object) {
					result.put(field.getName(), parserInstanceToJson(value));
				} else {
					Logger.log("the field:" + field.getName() + " can't covert to json");
				}
			}
		}
		return result.toString();
	}

	private static boolean isSimpleType(Object obj) {

		if (obj instanceof Integer || obj instanceof Long || obj instanceof Double || obj instanceof Float || obj instanceof Byte
				|| obj instanceof Short || obj instanceof Character || obj instanceof Boolean || obj instanceof String) {
			return true;

		}
		return false;
	}

	private static boolean isSimpleTypeArray(Object obj) {

		if (obj instanceof Integer[] || obj instanceof Long[] || obj instanceof Double[] || obj instanceof Float[] || obj instanceof Byte[]
				|| obj instanceof Short[] || obj instanceof Character[] || obj instanceof Boolean[] || obj instanceof String[]) {
			return true;

		}
		return false;
	}
}
