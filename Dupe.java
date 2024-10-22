import java.util.*;
public class Dupe {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};

        // Sort the array (optional since your array seems sorted, but good for general cases)
        Arrays.sort(arr);

        // Create a new array to store the unique values
        int[] result = new int[arr.length];
        int k = 0;  // Index for the result array

        // Loop to add unique elements to the result array
        result[k++] = arr[0];  // First element is always unique

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[k++] = arr[i];  // Add unique element
            }
        }

        // Print the unique elements and commas for duplicates
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                System.out.print(result[i]);
            } else {
                System.out.print(",");
            }

            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
    }
}
