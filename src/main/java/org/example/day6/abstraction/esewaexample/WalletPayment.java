package org.example.day6.abstraction.esewaexample;

/**
 * @author Bibash Bogati
 * @created 2025-02-21
 */
public class WalletPayment extends Payment {

    @Override
    double payAmount(double amount) {

        return getCommission() + commission;
    }


}
