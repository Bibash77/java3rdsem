package org.example.day6.abstraction.esewaexample;

/**
 * @author Bibash Bogati
 * @created 2025-02-21
 */
public class MainMethod {

    public static void main(String[] args) {
        WalletPayment payment = new WalletPayment();

        // comes from parent
        payment.commission = 0.10;

        // declared in child --> wallet payment


        System.out.println(payment.paymentCode);
        System.out.println(payment.commission);

//      double amount =  payment.payAmount(100);
//        System.out.println("Amount paid is " + amount);


//        ------------------------------ Bank Payment -----------------------

        BankPayment bankPayment = new BankPayment();
        System.out.println(bankPayment.paymentCode);



//        ---------------------------


    }
}
