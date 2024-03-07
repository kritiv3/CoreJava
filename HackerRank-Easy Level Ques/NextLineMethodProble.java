import java.util.Scanner;

public class NextLineMethodProble {
   
    public static void main(String[] args) {
        /* Read input from STDIN. Print output to STDOUT. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double fNum=sc.nextDouble();
        sc.nextLine();
        String str=sc.nextLine();
        sc.close();
        
        
        System.out.println("String: "+str);
        System.out.println("Double: "+fNum);
        System.out.println("Int: "+num);
    }
}
    

