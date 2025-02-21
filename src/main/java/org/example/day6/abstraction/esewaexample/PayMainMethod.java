package org.example.day6.abstraction.esewaexample;

/**
 * @author Bibash Bogati
 * @created 2025-02-21
 */
public class PayMainMethod {

    public static void main(String[] args) {

        // POST /eswa/pay
//        gateway code recieve
        // prepare api


        // payment type
        PaymentType paymentType = PaymentType.ESEWA;
        String  bankCode = "SIDDHARTHA";
        double payAmount = 100;

        Payment payment1;
        if(paymentType == PaymentType.ESEWA) {
            payment1 = new WalletPayment();
        } else {
            if(bankCode.equals("SIDDHARTHA")) {
                payment1 = new SiddharthaBankPayment();
            } else {
                payment1 = new BankPayment();
            }
        }


        double paid = payment1.payAmount(payAmount);

//        double commission = payment1.getCommission();

        System.out.println(paid);
//        System.out.println(commission);

    }
}
