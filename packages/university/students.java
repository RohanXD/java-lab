package packages.university;

public class students {
    int roll;
    String name;
    void display(){
        roll=2;
        name="Kaluuuuuuuuuu";
        System.out.println("students class from Package university");
        System.out.println("Roll"+roll);
        System.out.println("Name"+name);
    }
    public static void main(String[] args) {
        
    }
}

// access modifier 
// 1. Private: can be accessed with the class
// 2. Protected: can be accessed outside the class with only inheritance
// 3. Default: in the same class or file works as public
// 4. Public: can be accesed without any restrictions
