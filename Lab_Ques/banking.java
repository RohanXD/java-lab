// ek bank class banani hai jisme data member hai acccount no, name 
import java.util.Scanner;
public class banking{
    private int Account_no;
    private String Account_name;
    private long Contact_no;
    private float Minimum_bal;
    private float Balance;
    banking(){
        Account_name=null;
        Account_no=0;
        Contact_no=0;
        Minimum_bal=3235;
        Balance=0;
    }

    public void display(){
        System.out.println("Balance is:"+this.Balance);
    }
    public void getValues(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Number:");
        this.Account_no=sc.nextInt();
        System.out.print("Enter Account Name:");
        this.Account_name=sc.next();
        System.out.print("Enter Contact Number:");
        this.Contact_no=sc.nextLong();
        System.out.print("Enter Minimum Balance:");
        this.Minimum_bal=sc.nextFloat();
        System.out.print("Enter Deposit Balance:");
        this.Balance=sc.nextFloat();       
    }


    public static void main(String[] args) {
        banking ob=new banking();
        ob.getValues();
        ob.display();

    }
}