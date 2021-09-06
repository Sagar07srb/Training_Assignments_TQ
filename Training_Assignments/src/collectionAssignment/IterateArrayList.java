package collectionAssignment;

import java.util.*;

public class IterateArrayList {
	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i=1;i<=5;i++)
		{
			list.add(i);
		}
		Iterator<Integer> itr = list.iterator();
 
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
