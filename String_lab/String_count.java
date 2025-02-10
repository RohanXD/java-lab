package String_lab;
import java.util.Scanner;

public class String_count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        int wordCount = 1;        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                wordCount++;
            }
        }
        System.out.println("The total number of words is: " + wordCount);
    }
}
