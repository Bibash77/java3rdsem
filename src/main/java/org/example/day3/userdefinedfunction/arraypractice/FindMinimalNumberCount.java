package org.example.day3.userdefinedfunction.arraypractice;

/**
 * @author Bibash Bogati
 * @created 2025-02-10
 */

//You are given an array of integers. Your task is to write a function in Java
// that returns the number of times the smallest element appears in the array.


public class FindMinimalNumberCount {

    public static void main(String[] args) {
        int[] numbers = {9,3,2,5,6,7,8,2,5,4,3,2,1};

        FindMinimalNumberCount findMinimalNumberCount = new FindMinimalNumberCount();
        System.out.println(findMinimalNumberCount.countMin(numbers));
    }

    public int countMin(int[] numbers) {
        int minimum = numbers[0];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == minimum) {
                count++;
            } else if (numbers[i] < minimum) {
                minimum = numbers[i];
                count = 1;
            }
        }
        return count;
    }
}
