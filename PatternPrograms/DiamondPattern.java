//WAP to print Dynamic Pattern as below
/* 
   *
  * *
 * * *
* * * * 
 * * * 
  * * 
   *   
*/
import java.util.Scanner;

public class DiamondPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n= sc.nextInt();
        int temp;
        for(int i=1;i<2*n;i++){
            if(i<n)temp=n-i;
            else temp=i-n;
    
            for( int j=1; j<=temp; j++){
                System.out.print(" ");
            }
            for( int k=1; k<=n-temp; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
