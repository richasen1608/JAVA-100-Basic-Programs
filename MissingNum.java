public class MissingNum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int startRange = 1; // Starting number of the range
        int endRange = 5;   // Ending number of the range

        for (int i = startRange; i <= endRange; i++) {
            boolean isMissing = true;
            for (int num : array) {
                if (num == i) {
                    isMissing = false;
                    break;
                }
            }
            if (isMissing) {
                System.out.println(i + " is missing from the array.");
            } else {
                System.out.println(i + " is present in the array.");
            }
        }
    }
}
