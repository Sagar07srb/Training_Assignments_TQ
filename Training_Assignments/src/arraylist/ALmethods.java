package arraylist;

import java.util.ArrayList;

public class ALmethods {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		ArrayList<String> l2=new ArrayList<>();
		//Adding elements to Arraylist
		l.add(10);
		l.add(20);
		l.add(30);
		l.remove(0);
		
		l2.add("Hello");
		l2.add("Welcome");
		l2.add("To Java");
		l2.remove("Hello");
		System.out.println(l);
		System.out.println(l2);
		
        
	}

}
