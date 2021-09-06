package map_Assignments;

import java.util.Collection;
import java.util.HashMap;

public class Assignment_7 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "ELEVEN");
		map.put(12, "TWELVE");
		map.put(13, "THIRTEEN");
		map.put(12, "TWELVE");

		Collection str = map.values();

		System.out.print("VALUES:: ");
		System.out.println(str);

	}

}
