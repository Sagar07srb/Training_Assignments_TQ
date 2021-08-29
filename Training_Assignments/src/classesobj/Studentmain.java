package classesobj;

public class Studentmain {

	public static void main(String[] args) {
		Student s=new Student();
		
		System.out.println("Public:"+s.rollno);
		//System.out.println("Private:"+s.addmisionNo); because private members not accessible
		
		System.out.println("Protected:"+s.age);
		System.out.println("default:"+s.CourseId);
		
		s.doPublic();
		//s.doPrivate();
		s.doProtected();
		s.doDefault();

	}

}
