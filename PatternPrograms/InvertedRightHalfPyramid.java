//WAP to print Inverted Right Half Pyramid as below
/* 

* * * * *
* * * *
* * *
* *
*

*/
import java.util.Scanner;

public class InvertedRightHalfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n= sc.nextInt();
        for( int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){

                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}