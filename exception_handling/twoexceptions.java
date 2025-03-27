/*WAP in java that will call DiviosionByZero Exception when we divide
two integer values and choose denominator as zero while it will call 
Zero Exception when choose numberator as Zero and calles BothZero Exception
when both numerator and denominator as Zero.
 */
package exception_handling;
import java.util.*;
class twoexceptions {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter 1st Number: ");
            a = sc.nextInt();
            System.out.print("Enter 2nd Number: ");
            b = sc.nextInt();
            if(b == 0 && a==0) throw new ArithmeticException("Both cannot be zero.");
            if (a == 0) throw new ArithmeticException("Numerator cannot be zero.");
            c=a/b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid Input.");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong.");
        } finally {
            sc.close();
        }
    }
}