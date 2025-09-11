import java.util.*;
class Armstrong
{
    public static void main (String ar[])
    {
        int n,m,r;
        int a=0;
        Scanner s=new Scanner (System.in);
        System.out.print("Enter a number=");
        n=s.nextInt();
        m=n;
        while (n>0)
        {
            r=n%10;
            a=r*r*r+a;
            n=n/10;
        }
        if (m==a)
        {
            System.out.print("Armstrong");
        }

        else
        {
            System.out.print("Not Armstrong");
        }
    }
}