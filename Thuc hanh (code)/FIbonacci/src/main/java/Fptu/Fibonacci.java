package Fptu;
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the number of first digits in the Fibonacci sequence you want to output: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] fibSequence = generateFibonacci(n);  // Get the Fibonacci sequence as an array
            for (int num : fibSequence) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to generate Fibonacci sequence up to 'n' numbers
    public static int[] generateFibonacci(int n) {
        if (n <= 0) {
            return new int[] {};  // Return empty array for invalid input
        }
        int[] result = new int[n];
        if (n >= 1) result[0] = 0;  // First term
        if (n >= 2) result[1] = 1;  // Second term

        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];  // Fibonacci formula
        }
        return result;
    }
}
