//WAP to print Hollow Diamond Pyramid as below
/* 
        *           |           1           
      *   *         |         1   3        
    *       *       |       1       5       
  *           *     |     1           7    
*               *   |   1               9   
  *           *     |     1           7     
    *       *       |       1       5       
      *   *         |         1   3         
        *           |           1           
*/
import java.util.Scanner;

public class HollowDiamondPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n= sc.nextInt();
        int temp=0,copy_i=0;
        for(int i=1;i<2*n;i++){
            if(i<n)temp=n-i;
            else temp=i-n;

            for(int j=1; j<=temp; j++){
                System.out.print("  ");
            }

            if(i<n)copy_i=i;
            else copy_i=i-2*temp;

            for(int k=1; k<=2*copy_i; k++){
                if(k==1 || k==2*copy_i-1)System.out.print("* ");
                else System.out.print("  ");
            }           
            System.out.println();
        }
        sc.close();
    }
}
