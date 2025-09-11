public class Power {
   public static void main(String ar[])
   {
    int base = 7;
    int exp = 8;
    int power = 1;
    for(int i = 0; i < exp ; i++)
    {
        power = power * base;
    }
    System.out.print(power);
   } 
}
