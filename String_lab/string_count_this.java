package String_lab;
import java.util.Scanner;
public class string_count_this {
    static int count_this(String str){
        int j = 0;
        String word = "this";
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i, i + word.length()).equals(word))
                j++;
        }
        return j;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with a lot of 'this':");
        String input_String = sc.nextLine();
        int count = count_this(input_String);
        System.out.println("Number of 'this': " + count);
    }
}
