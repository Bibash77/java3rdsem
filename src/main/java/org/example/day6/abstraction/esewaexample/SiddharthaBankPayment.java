package org.example.day6.abstraction.esewaexample;

/**
 * @author Bibash Bogati
 * @created 2025-02-21
 */

// multi level inheritence
public class SiddharthaBankPayment extends BankPayment {

    double siddharthaBankCommission = 1;

    public double payAmount(double amount) {
        return amount + getCommission();
    }


    @Override
    public double getCommission() {
        System.out.println("SiddharthaBankPayment getCommission");
        return super.getCommission()  + siddharthaBankCommission;
    }

}
