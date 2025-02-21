package org.example.arrayss.example.maths;

/**
 * @author Bibash Bogati
 * @created 2025-02-17
 */
public class NextPrimeAfterN {


    public static int nextPrime(int n) {
        // TODO: implement the function to find the next prime number after n


//        n +=1;
//        while (true) {
//            if (n % 2 != 0) {
//                return n;
//            }
//        }
        n++;
        for (int i = n; i < Integer.MAX_VALUE; i++) {
            if(isPrime(i)) {
                return i;
            }
        }
        return 0;
    }

    public static boolean isPrime(long n) {
        for (long i = 2; i  <= n/2 ; i ++) {
            if (n % i == 0) {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(nextPrime(77));
    }
}
