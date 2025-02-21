package org.example.day6.abstraction.esewaexample;

/**
 * @author Bibash Bogati
 * @created 2025-02-21
 */
public abstract   class Payment {
    // properties
    public double commission = 10 ;
    public String paymentCode =  "ESEWA";

    abstract  double payAmount(double amount);

    // methods
    public double getCommission() {
        System.out.println("Default getCommission");

        return commission;
    }


}
