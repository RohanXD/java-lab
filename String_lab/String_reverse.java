package String_lab;
import java.util.Scanner;
public class String_reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
        char[] inputArray = input.toCharArray();
        int length = inputArray.length;
        char[] reversedArray = new char[length];
        for (int i = 0; i < length; i++)
            reversedArray[i] = inputArray[length - 1 - i];
        String reversedString = new String(reversedArray);
        System.out.println("Reversed string: " + reversedString);
    }
}
