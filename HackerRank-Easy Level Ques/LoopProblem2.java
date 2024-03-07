import java.util.Scanner;
import java.lang.Math;

public class LoopProblem2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int a,b,n,sum,powResult;
        for(int i=0;i<q;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();
            sum=0;
            powResult=0;
            for(int j=0;j<n;j++){
                powResult+=(int)((Math.pow(2,j))*b);
                // System.out.print("pow= "+powResult+" ");
                // sum+=powResult;
                System.out.print(powResult+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}