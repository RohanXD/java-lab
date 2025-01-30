package Interface;

public interface bank {

    void openAcc();
    default void xyz(){
        System.out.println("Inside B");
    }
}
class axisBank implements bank{
    int acc,bal;
    String Name;
    public void openAcc(){
        System.out.println("Inside A");
    }
    public static void main(String[] args) {
        
    }
}

