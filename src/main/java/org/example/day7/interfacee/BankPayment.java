package org.example.day7.interfacee;

/**
 * @author Bibash Bogati
 * @created 2025-03-09
 */
public class BankPayment implements Payment,SpecialPayment {

    // fetch comission from database;
    double comision = 10;

    @Override
    public double payWithSpecialAmount(double amount) {
        System.out.println("Bank Special Paying amount is " + amount);

        return amount + 5;
    }

    @Override
    public double payAmount(double amount) {
        System.out.println("Bank Paying amount is " + amount);
        return amount+10;
    }
}
