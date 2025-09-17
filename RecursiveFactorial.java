package functions;
import java.util.*;
public class RecursiveFactorial {
    static int Fact(int n) {
        if (n==0) {
            return 1;
        }
        else {
            return n*Fact(n-1);
        }
    }
    public static void main (String ar[]) {
        int f,a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number");
        a=s.nextInt();
        f=RecursiveFactorial.Fact(a);
        System.out.println("Factorial=" + f );
    }
    
}
