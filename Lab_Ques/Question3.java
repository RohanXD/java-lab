import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Program start");
        Scanner num = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = num.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = num.nextInt();
        swapnum(num1,num2);
    }
    public static void swapnum(int x,int y) {
        System.out.println("The value Before swap of a is "+x+" and the value of b is "+ y);
        x=x+y;
        y=x-y;
        y=x-y;
        System.out.println("The value After swap of a is "+x+" and the value of b is "+ y);
    }
}
