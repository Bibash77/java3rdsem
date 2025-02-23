package org.example.day6.abstraction.esewaexample;

/**
 * @author Bibash Bogati
 * @created 2025-02-23
 */
public class PaymentMethodAbsentStudnets {

    public static void main(String[] args) {

        double amount =  50;

        Payment walletPayment = new WalletPayment();
//        // inherit
        System.out.println("Wallet commission " + walletPayment.getCommission());
//        // inherit
//        System.out.println(walletPayment.commission);
//        // inherit
//        System.out.println(walletPayment.paymentCode);
//
//        // not applicable for inheritence
        System.out.println("Total payment through wallet " + walletPayment.payAmount(amount));


        System.out.println("-------------------------------------------------------------");

        Payment bankPayment = new BankPayment();
        System.out.println("Bank Commission" + bankPayment.getCommission());
        System.out.println("Total payment through Bank " + bankPayment.payAmount(amount));


        System.out.println("--------------------------------------------------------------");

        Payment siddharthaBankPayment = new SiddharthaBankPayment();
        System.out.println("Siddhartha commision defined by roshan topper "+ siddharthaBankPayment.getCommission());
        System.out.println("Paying through siddhartha bank by topper: " + siddharthaBankPayment.payAmount(amount));


    }
}
