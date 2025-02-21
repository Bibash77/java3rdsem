package org.example.day6.abstraction.esewaexample;

/**
 * @author Bibash Bogati
 * @created 2025-02-21
 */

public class BankPayment extends Payment {

    double bankCommision = 3.5;

    @Override
    double payAmount(double amount) {
        return commission+ amount + bankCommision;
    }

    @Override
    public double getCommission() {
        System.out.println("Bank getCommission");

        return super.getCommission() + bankCommision;
    }

}
