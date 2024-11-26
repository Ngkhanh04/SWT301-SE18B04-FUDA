package Fptu;

public int[] getSumArray(int[] ar) {
    int[] result = new int[ar.length];  // Initialize an array to store results
    for (int i = 0; i < ar.length; i++) {  // Loop through the array
        int sum = 0;
        for (int j = 0; j <= i; j++) {  // Corrected the inner loop condition
            sum += ar[j];  // Sum the elements
        }
        result[i] = sum;  // Store the sum in the result array
    }
    return result;  // Return the result array
}
