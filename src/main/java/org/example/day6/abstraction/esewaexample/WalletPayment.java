package org.example.day6.abstraction.esewaexample;

/**
 * @author Bibash Bogati
 * @created 2025-02-21
 */

// father
public class WalletPayment extends Payment {

    @Override
    double payAmount(double amount) {

        return super.getCommission() + amount;
    }

}
