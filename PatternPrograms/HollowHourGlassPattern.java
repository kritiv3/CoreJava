//WAP to print Hollow Hour Glass Pattern as below
/* 
* * * * * * * * *   |   1 2 3 4 5 6 7 8 9    
  *           *     |     1           7      
    *       *       |       1       5       
      *   *         |         1   3          
        *           |           1            
      *   *         |         1   3         
    *       *       |       1       5        
  *           *     |     1           7     
* * * * * * * * *   |   1 2 3 4 5 6 7 8 9    
 
*/
import java.util.Scanner;

public class HollowHourGlassPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n= sc.nextInt();
        int temp;
        for(int i=1;i<2*n;i++){
            if(i<=n)temp=n-i+1;
            else temp=i-n+1;
    
            for( int j=1; j<=n-temp; j++){
                System.out.print("  ");
            }
            for( int k=1; k<2*n; k++){
                if(i==1 || i==2*n-1)System.out.print("* ");
                else if(k==1 || k==2*temp-1)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
