package map_Assignments;

import java.util.HashMap;

public class Assignment_8 {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, Student1> map=new HashMap<Integer, Student1>();
		map.put(1, new Student1("Charan", 107));
		map.put(2, new Student1("Ram", 110));
		
		System.out.println(map);
		
	}

}
