//WAP to print Hollow Square Pattern as below
/* 
*  *  *  *  *
*           *
*           *
*           *
*  *  *  *  *
 
*/
import java.util.Scanner;

public class HollowSquarePattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n= sc.nextInt();
        int temp;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n)temp=n;
            else temp=1;
    
            for( int j=1; j<=temp; j++){
                System.out.print("*  ");
            }
            for( int k=1; k<=n-temp-1; k++){
                System.out.print("   ");
            }           
            if(temp==1)System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
