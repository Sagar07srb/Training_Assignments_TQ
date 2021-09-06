package collectionAssignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapdemo {

	public static void main(String[] args) {

		HashMap m = new HashMap();
		m.put(1, "Welcome");
		m.put(2, "To");
		m.put(3, "Collection");

		System.out.println(m);

		System.out.println(m.put(2, "Enjoy"));

		System.out.println(m);

		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);

	}
}
