package collectionAssignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {
 public static void main(String[] args)
 {
	 LinkedHashSet<String> list=new LinkedHashSet();
	 list.add("Mon");
	 list.add("Tues");
	 list.add("Wed");
	 list.add("Mon");
	 
	 
     
     Iterator<String> i= list.iterator();
     while(i.hasNext())
    	 System.out.println(i.next());
 }
}
