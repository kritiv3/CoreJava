//WAP to print Hollow Inverted Pyramid as below
/* 
* * * * * * * * *  
  *           *     
    *       *      
      *   *         
        *          
 
*/
import java.util.Scanner;

public class HollowInvertedPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n= sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<2*n; k++){
                if(k==1 || k==2*i-1 || i==n)System.out.print("* ");
                else System.out.print("  ");
            }           
            System.out.println();
        }
        sc.close();
    }
}
