package org.example.day6.abstraction.esewaexample;

/**
 * @author Bibash Bogati
 * @created 2025-02-21
 */

// father
public class BankPayment extends Payment {

    double bankCommision = 3.5;

    @Override
    double payAmount(double amount) {
        return getCommission() + amount;
    }

    @Override
    public double getCommission() {
        System.out.println("Bank getCommission");

        // 13.5
        // parent : 10
//        child: 3.5
        return super.getCommission() + bankCommision;
    }

}
