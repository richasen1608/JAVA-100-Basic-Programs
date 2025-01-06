public class Move0 {

        public static void main(String[] args) {
            int[] array = {0, 1, 0, 3, 12, 0, 5, 0};

            // Count the number of non-zero elements
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    array[count++] = array[i];
                }
            }

            // Fill the rest of the array with zeros
            while (count < array.length) {
                array[count++] = 0;
            }

            // Print the modified array
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }


