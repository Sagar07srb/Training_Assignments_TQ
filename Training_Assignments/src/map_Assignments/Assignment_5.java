package map_Assignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Assignment_5 {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(10, "Master");
		map.put(18, "Chiku");
		map.put(7, "MSD");
		
		Set<Integer> key=map.keySet();
		
		System.out.print("KEY:: ");
		for(int i:key)
		{
			System.out.print("\t"+i);
		}
		
		Collection str=map.values();
		
		System.out.print("\nVALUES:: ");
		System.out.print(str);
	
		
		
	}
}
