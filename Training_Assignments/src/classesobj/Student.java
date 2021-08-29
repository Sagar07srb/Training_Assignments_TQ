package classesobj;


public class Student {

	public int rollno=11;
	private int addmisionNo=007;
	protected int age=20;
	int CourseId=101;
	
   public void doPublic()
   {
	   System.out.println("Inside public Method");
   }
   
   private void doPrivate()
   {
	   System.out.println("Inside Private method");
   }
   
   protected void doProtected()
   {
	   System.out.println("Inside Protected Method");
   }
   
   void doDefault()
   {
	   System.out.println("Inside Default.....");
   }
}
