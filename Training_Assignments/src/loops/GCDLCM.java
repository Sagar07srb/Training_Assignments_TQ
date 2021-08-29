package loops;
import java.util.*;
public class GCDLCM {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int g = 0;
		System.out.println("enter 1st num");
		int n1=s.nextInt();
		
		System.out.println("enter 2nd num");
		int n2=s.nextInt();
		
		for(int i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				 g=i;
			}
		}
		System.out.println(g+"=GCD");
		
		int Lcm=n1*n2/g;
		
		System.out.println(Lcm+"=LCM");
	}

}
