package loops;

import java.util.*;
class KrishanMurthy
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=ss.nextInt();
        int m=n,r=0,f=1,check_num=0;
        while(n>0)
        {
            r=n%10;//5,4,1
            for(int i=1;i<=r;i++)
            {
                f=f*i;
            }
            check_num=check_num+f;
            n=n/10;
            f=1;
        }
        if(check_num==m)
            System.out.println("yes!!! the number is Krishnamurthy Number");
        else
        System.out.println("No!!! the number is Krishnamurthy Number");
    }
}



