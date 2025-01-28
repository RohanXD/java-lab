package Inheritance;

public class inherit {
    private int id,pin;
    private String district;
    void getValues(){
        id=65;
        pin=281403;
        district="asdasd";
    }
    void display(){
        System.out.println("ID="+id);
        System.out.println("PIN="+pin);
        System.out.println("District="+district);
    }
}


// one class (called the child or subclass) to inherit properties and methods from another class (called the parent or superclass). 
// It enables code reusability, extensibility, and organization by creating a hierarchical relationship between clḁsses.