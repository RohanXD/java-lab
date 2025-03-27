/* WAP in java that will call NullPointerExpception with a error 
message that "Wrong Type of Value used" when we input a value other 
than interger type and stored in interger variable. */
package exception_handling;
import java.util.*;
public class nullpointer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Input an Interger:");
            int a=sc.nextInt();
        } catch (InputMismatchException e) 
        {
            throw new NullPointerException("Wrong Type of Value used");
        }
        finally{
            sc.close();
        }
    }
}
