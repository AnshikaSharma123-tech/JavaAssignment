public class CountWords {
    public static void main(String[] args) {   
        String s = "This is rdec sec f";
        int n=0;
       for (int i=0 ; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                n++;
            }
        }
        System.out.print("No. of Words="+(n+1));
    }
}

