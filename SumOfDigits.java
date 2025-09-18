package functions;

public class SumOfDigits { 
    static int sum(int n) {
            if(n== 0) {
               return 0;
               
            }
            
            return n%10 + sum(n/10);
        
        
    }    
    public static void main(String ar[]) {
        int r=0,a=0;
        int s=SumOfDigits.sum(567);
        System.out.print("Sum=" + s);
    }
    
}
