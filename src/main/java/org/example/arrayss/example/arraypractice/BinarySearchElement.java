package org.example.arrayss.example.arraypractice;

/**
 * @author Bibash Bogati
 * @created 2025-02-12
 */
public class BinarySearchElement {

    public boolean isPerfectSquare(long n) {

        long low = 0;
        long high = n;


        while(low <= high) {

            long mid = (low+high)/2;
            long midSquare = mid*mid;

            if(midSquare ==  n) {
                return true;
            }

            if(midSquare < n) {
                low = mid-1;
            } else {
                high = mid+1;
            }


        }
        return false;

    }

    public static void main(String[] args) {
        BinarySearchElement solution = new BinarySearchElement();
        System.out.println(solution.isPerfectSquare(16));
    }
}
