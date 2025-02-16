package org.example.arrayss.example.arraypractice;

/**
 * @author Bibash Bogati
 * @created 2025-02-10
 */

public class FindMinimalNumberCount {

    public static void main(String[] args) {
        int[] numbers = {9, 3, 2, 5, 6, 7, 8, 2, 5, 4, 3, 2, 1, -2, -4,-4,-4,-4};

        FindMinimalNumberCount findMinimalNumberCount = new FindMinimalNumberCount();
        System.out.println(findMinimalNumberCount.countMin(numbers));
    }

    public int countMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int minimum = numbers[0];
        int count = 1; // Initialize count to 1 because the first element is already the minimum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == minimum) {
                count++; // Increment count if the current element is equal to the minimum
            } else if (numbers[i] < minimum) {
                minimum = numbers[i]; // Update minimum if a smaller element is found
                count = 1; // Reset count to 1 for the new minimum
            }
        }
        return count;
    }
}