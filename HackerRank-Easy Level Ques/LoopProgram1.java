import java.util.Scanner;

public class LoopProgram1 {
   
    public static void main(String[] args) {
        //Table Program
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        sc.close();
    
    }
}
