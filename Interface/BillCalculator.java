//create an interface bill that contains calculate bill function and 
//show bil function inhrit such interface into telephone and electricity class 
//to use it calculate bill function is to be implemented within the classes. 
//while show bill function is defined with in the interface
package Interface;

interface Bill {
    void calculateBill();
    void showBill();
}

class Telephone implements Bill {
    private double callRate;
    private double numCalls;
    private double totalBill;

    public Telephone(double callRate, double numCalls) {
        this.callRate = callRate;
        this.numCalls = numCalls;
        this.totalBill = 0.0;
    }

    public void calculateBill() {
        totalBill = callRate * numCalls;
    }
    
    public void showBill() {
        System.out.println("Telephone Bill: " + totalBill);
    }
}

class Electricity implements Bill {
    private double unitRate;
    private double unitsConsumed;
    private double totalBill;

    public Electricity(double unitRate, double unitsConsumed) {
        this.unitRate = unitRate;
        this.unitsConsumed = unitsConsumed;
        this.totalBill = 0.0;
    }

    public void calculateBill() {
        totalBill = unitRate * unitsConsumed;
    }
    
    public void showBill() {
        System.out.println("Electricity Bill: " + totalBill);
    }
}

public class BillCalculator {
    public static void main(String[] args) {
        Telephone phoneBill = new Telephone(0.5, 100); // Call rate per call and number of calls
        Electricity electricityBill = new Electricity(10, 250); // Rate per unit and units consumed

        phoneBill.calculateBill();
        phoneBill.showBill();
        
        electricityBill.calculateBill();
        electricityBill.showBill();
    }
}