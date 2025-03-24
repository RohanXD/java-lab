package exception_handling;
import java.util.*;
class division{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        boolean anotherDivision = true;

        while (anotherDivision) {
            boolean successfullDivision = false;
            
            while (!successfullDivision) {
                try {
                    System.out.print("Enter 1st Number:");
                    a=sc.nextInt();
                    System.out.print("Enter 2nd Number:");
                    b=sc.nextInt();
                    c=a/b;
                    System.out.println("Result:"+c);
                    successfullDivision=true;
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero.");
                } catch (InputMismatchException e){
                    System.out.println("Error: Invalid Input.");
                    sc.nextLine();
                } catch (Exception e){
                    System.out.println("Error: Something went Wrong.");
                }
            }
            System.out.println("Do you want to continue (Yes/No):");
            String response=sc.next().toLowerCase();
            anotherDivision=response.equals("yes");
        }
        System.out.println("Program Terminated");
        sc.close();

    }
}