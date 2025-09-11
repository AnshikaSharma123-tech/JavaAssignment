public class Triangle {
  public static void main(String ar[])  {
    int n=7,i,j,k;
    for(i=0;i<n;i++){
        for (j=n-i;j>1;j--) {
            System.out.print(" ");
        }
        for(k=0;k<=i;k++) {
            System.out.print("* ");
        }
        System.out.println();
    }


  } 
}
