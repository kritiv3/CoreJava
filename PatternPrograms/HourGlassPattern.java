//WAP to print Hour Glass Pattern as below
/* 
 * * * 
  * * 
   *   
  * *
 * * *
 
*/
import java.util.Scanner;

public class HourGlassPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n= sc.nextInt();
        int temp;
        for(int i=1;i<2*n+1;i++){
            if(i<=n)temp=n-i+1;
            else temp=i-n;
    
            for( int j=1; j<=n-temp; j++){
                System.out.print(" ");
            }
            for( int k=1; k<=temp; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
