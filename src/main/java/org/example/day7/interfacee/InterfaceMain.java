package org.example.day7.interfacee;

/**
 * @author Bibash Bogati
 * @created 2025-03-09
 */
public class InterfaceMain {

    public static void main(String[] args) {
        String paymentType = "BANK";
        Payment payment;

        if(paymentType.equals("ESEWA")){
            payment = new EsewaPayment();
        } else {
            payment = new BankPayment();
        }

        SpecialPayment specialPayment;
        specialPayment = new BankPayment();

        specialPayment.payWithSpecialAmount(10);
        specialPayment.payAmount(10);

        Payment payment1 = new EsewaPayment();

        payment1.payAmount(10);


    }
}
