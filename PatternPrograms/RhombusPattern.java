//WAP to print Rhombus Pattern as below
/* 

* * * * * 
 * * * * * 
  * * * * * 
   * * * * * 
    * * * * *  
*/
import java.util.Scanner;

public class RhombusPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for( int j=n-i+1; j<n; j++){
                System.out.print(" ");
            }
            for( int k=1; k<=n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
