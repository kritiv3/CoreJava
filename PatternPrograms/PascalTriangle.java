//WAP to print PascalTriangle as below
/* 
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 
 
*/
import java.util.Scanner;

public class PascalTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
          for(int j=1; j<=n-i; j++){
            System.out.print("  ");
          }
          int c=1;
          for(int k=1; k<=i; k++){
            System.out.print(c+"  ");
            c=c*(i - k)/k;
          }
          System.out.println();
        }
        sc.close();
    }
}
