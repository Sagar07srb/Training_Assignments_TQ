package collectionAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
 public static void main(String[] args)
 {
	 HashSet<String> hs= new HashSet();
	 
	 hs.add("Java");
	 hs.add("Lab");
	 hs.add(null);
	 
	 ArrayList l=new ArrayList();
	 l.add("A");
     l.add("B");
     
     hs.addAll(l);
     
     Iterator<String> i= hs.iterator();
     while(i.hasNext())
    	 System.out.println(i.next());
 }
}
