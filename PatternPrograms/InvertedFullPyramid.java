//WAP to print Inverted Full Pyramid as below
/* 

* * * * *
 * * * *
  * * *
   * *
    *  
*/
import java.util.Scanner;

public class InvertedFullPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for( int j=n-i+1; j<n; j++){
                System.out.print(" ");
            }
            for( int k=n; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
