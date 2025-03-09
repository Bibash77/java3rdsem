package org.example.day7.interfacee;

/**
 * @author Bibash Bogati
 * @created 2025-03-09
 */
public class EsewaPayment implements Payment {

    //database repositry --> data get garni thau

    @Override
    public double payAmount(double amount) {
        System.out.println("Esewa Paying amount is " + amount);
        return amount;
    }
}
