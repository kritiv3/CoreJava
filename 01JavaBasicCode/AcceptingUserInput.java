/*sometimes we may face a situation where we need to get the input from the user at runtime then we can use 
Scanner Class to accept input from the user*/
import java.util.Scanner;

public class AcceptingUserInput{
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter multiple words = ");
        String str2 = userInput.nextLine(); //It reads till end of the line

        System.out.print("Enter string = ");
        String str = userInput.next(); //it reads till encountered space

        
        System.out.print("Enter number = ");
        int num = userInput.nextInt(); //nextInt for taking integer  
       
        System.out.println("num = "+num);
        System.out.println("String = "+str);
        System.out.println("String with multiple words handling space = "+str2);

        userInput.close();

    }
}