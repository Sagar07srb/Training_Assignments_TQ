package classesobj;

public class Overload {

	public int myAdd(int a,int b)
	{
		return a+b;
		
	}
	
	public double myAdd(double a,double b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		Overload o=new Overload();
		
		System.out.println("int addition::"+o.myAdd(10, 10));
		System.out.println("double addition::"+o.myAdd(10.10,20.10));
		
	}

}
