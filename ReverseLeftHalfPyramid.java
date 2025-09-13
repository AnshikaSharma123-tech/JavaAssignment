public class ReverseLeftHalfPyramid {

    public static void main (String ar[]) {
        int n=6,i,j;
        for(i=n;i>0;i--) {
            for(j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
