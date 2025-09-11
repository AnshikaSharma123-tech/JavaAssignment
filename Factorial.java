import java.util.Scanner;
 class fact
{
    public static void main(String ar[])
{
    int n,i,f=1;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter number=");
    n=s.nextInt();
    if (n==0)
    {
        System.out.print("Factorial=" + f);
 }
 else{
    for(i=1;i<=n;i++)
    {
        f=f*i;
    }}
 
 System.out.print("Fctorial=" + f);

}
}