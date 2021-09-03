package DebugAssignments;

public class MainCounter {

	public static void main(String[] args) {
		System.out.println("Hello Debugging....");
		
		Counter c=new Counter();
		
		c.count();
		System.out.println("We have Counted:"+c.getResult());

	}

}
