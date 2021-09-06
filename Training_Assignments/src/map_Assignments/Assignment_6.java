package map_Assignments;

import java.util.HashMap;
import java.util.Set;

public class Assignment_6 {

public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(11, "ELEVEN");
		map.put(12, "TWELVE");
		map.put(13, "THIRTEEN");
		map.put(12, "TWELVE");
		Set<Integer> key=map.keySet();
		
		for(int i:key)
		{
			System.out.println(i+" : "+map.get(i));
		}
		
	}

}
