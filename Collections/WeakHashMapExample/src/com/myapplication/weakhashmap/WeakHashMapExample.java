/**
 * 
 */
package com.myapplication.weakhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author akanippayyur
 */
public class WeakHashMapExample {

	/**
	 * Prints the below output in the console<br>
	 * <code>
	 * 	hashMap - {key2=data2, key1=data1}<br>
	 * 	weakHashMap - {key5=data5}
	 * </code>
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> hashMap = getHashMap();
		Map<String, String> weakHashMap = getWeakHashMap();
		System.gc();
		System.out.println("hashMap - " +hashMap);
		System.out.println("weakHashMap - " +weakHashMap);
	}

	/**
	 * @return map
	 */
	private static Map<String, String> getWeakHashMap() {
		Map<String, String> weakHashMap = new WeakHashMap<String, String>();
		String key2 = new String("key2");
		weakHashMap.put(key2, "data2");
		weakHashMap.put("key5", "data5");
		key2 = null;
		return weakHashMap;
	}

	/**
	 * @return map
	 */
	private static Map<String, String> getHashMap() {
		Map<String, String> hashMap = new HashMap<String, String>();
		String key1 = new String("key1");
		hashMap.put(key1, "data1");
		hashMap.put("key2", "data2");
		key1 = null;
		return hashMap;
	}
}
