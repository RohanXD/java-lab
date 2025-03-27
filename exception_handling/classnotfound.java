/*WAP in java that will call ClassNotFoundException with a error
message that "Such class in Not Available" when we define an array
of size N and try to access an array value present in index 
where index >=N.*/
package exception_handling;
import java.util.Scanner;
public class classnotfound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        System.out.print("Enter the index to access: ");
        int index = scanner.nextInt();
        try 
        {
            if (index >= N) throw new ClassNotFoundException("Such class is Not Available");
            else System.out.println("Value at index " + index + ": " + array[index]);
        } 
        catch (ClassNotFoundException e) {System.out.println(e.getMessage());} 
        catch (ArrayIndexOutOfBoundsException e) {System.out.println("Array index is out of bounds!");} 
        finally {scanner.close();}
    }
}