package org.example.arrayss.example.arraypractice;

/**
 * @author Bibash Bogati
 * @created 2025-02-12
 */
public class PerfectSquareNumber {

    public boolean isPerfectSquare(long n) {
        for(int i = 1; i <= n/2; i ++) {
            if((long) i *i ==n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PerfectSquareNumber perfectSquareNumber = new PerfectSquareNumber();
        System.out.println(perfectSquareNumber.isPerfectSquare(100));
    }
}
