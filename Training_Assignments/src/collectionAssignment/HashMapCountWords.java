package collectionAssignment;

import java.util.HashMap;

public class HashMapCountWords {
	public static void main(String[] args) {
		String str = "My name is name java is my name java java";

		String[] arr = str.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if (map.containsKey(arr[i])) {
				int wordcount = map.get(arr[i]);
				map.put(arr[i], wordcount + 1);
			}
			else
				map.put(arr[i],1);
		}
		System.out.println(map);
	}
}
