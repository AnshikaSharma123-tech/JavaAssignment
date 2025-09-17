package functions;

public class PrintRevDigits {
    static void PrintData(int c) {
        if (c<=0) {
           return; 
        }
        System.out.println(c);
        PrintData(c-1);
    }
    public static void main(String[] args) {
        PrintRevDigits.PrintData(5);
    }
}
