// the process of converting primitive data values into wrapper class object is known as autoboxing
public class wrapper {
    public static void main(String[] args) {
        Integer a = 100;
        int ob = a; // Autoboxing
        System.out.println(ob);

    }
}

// the process of converting wrapper class values into primitive data types is known as unboxing.
class ABC {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println(a);
    }
}