package org.example.day6.abstraction.esewaexample;

/**
 * @author Bibash Bogati
 * @created 2025-02-21
 */

// multi level inheritence
public class SiddharthaBankPayment extends BankPayment {

    double siddharthaBankCommission = 5;

    public double payAmount(double amount) {
        return amount + getCommission();
    }


    @Override
    public double getCommission() {
        System.out.println("SiddharthaBankPayment getCommission");
        // super: 13.5
        return super.getCommission()  + siddharthaBankCommission;
    }


    public  SiddharthaBankPayment() {

    }

    public  SiddharthaBankPayment(double amount) {

    }
}
