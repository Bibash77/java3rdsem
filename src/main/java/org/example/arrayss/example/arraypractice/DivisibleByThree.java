package org.example.arrayss.example.arraypractice;

public class DivisibleByThree {
    public static void main(String[] args) {
        String input = "4568";
        int totalSum = 0;

        // Iterate over all possible substrings
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                
                // Calculate the sum of digits for this substring
                int sum = 0;
                for (char ch : substring.toCharArray()) {
                    sum += ch - '0';  // Convert char to int
                }

                // Check if the sum is divisible by 3
                if (sum % 3 == 0) {
                    totalSum += sum;
                    System.out.println("Substring: " + substring + ", Sum: " + sum + " (Divisible by 3)");
                }
            }
        }

        System.out.println("Total Sum of all substrings divisible by 3: " + totalSum);
    }
}
