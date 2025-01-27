import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Program start");
        Scanner num = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = num.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = num.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = num.nextInt();
        
        checkGreatest(num1,num2,num3);
    }
    public static void checkGreatest(int x,int y,int z) {
        if (true) {
            int greatest = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
            System.out.println("The greatest number is: " + greatest);
        }
    }
}
