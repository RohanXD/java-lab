import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Program start");
        Scanner num = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = num.nextInt();
        
        evenOrOdd(a);
    }
    public static void evenOrOdd(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
    }
}
