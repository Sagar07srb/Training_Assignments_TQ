package classesobj;

public class TAccount {

	long AcctNo;
	String custname;
	
	 public TAccount()
	{
		System.out.println("In Default constrctor......");
		AcctNo=11;
		custname="abc";
	}
	
	 public TAccount(long AcctNo,String custname)
	 {
		 this.AcctNo=AcctNo;
		 this.custname=custname;
		 System.out.println("In parameterised .......");
	 }
	 
	 public void Display()
	 {
		 System.out.println("Account no:"+this.AcctNo);
		 System.out.println("Name"+this.custname);
	 }
	 
	public static void main(String args[])
	{
		TAccount sa=new TAccount();
		sa.Display();
		
		TAccount sa1=new TAccount(1,"MSD");
		sa1.Display();
	}

}


