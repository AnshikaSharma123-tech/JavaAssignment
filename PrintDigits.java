package functions;

public class PrintDigits {
    static void PrintData(int c) {
        if (c<=0) {
            return;
        }
        PrintData(c-1);
        System.out.println(c);
    }

    public static void main(String ar[]) {
        PrintDigits.PrintData(5);
    } 

}
