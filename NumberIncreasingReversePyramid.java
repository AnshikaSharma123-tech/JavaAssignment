public class NumberIncreasingReversePyramid {
    public static void main(String ar[]) {
        int n=7,i,j;
        for(i=n;i>=1;i--) {
            for(j=1;j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
