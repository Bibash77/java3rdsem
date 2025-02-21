package org.example.arrayss.example.arraypractice;

/**
 * @author Bibash Bogati
 * @created 2025-02-12
 */
public class PerfectSquareNumber {

    public boolean isPerfectSquare(long n) {
        for(long i = 1; i <= n/2; i ++) {
            System.out.println(i);
            if(i * i == n) {
                return true;
            }
        }
        return false;
    }

    public boolean isPerfectSquareMoreEfficient(long n) {
        long i = 1;
        while(i*i <= n) {
            System.out.println(i);

            if(i*i == n) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        PerfectSquareNumber perfectSquareNumber = new PerfectSquareNumber();
        System.out.println(perfectSquareNumber.isPerfectSquare(101));
        System.out.println("starting second time");
        System.out.println(perfectSquareNumber.isPerfectSquareMoreEfficient(101));
    }
}
