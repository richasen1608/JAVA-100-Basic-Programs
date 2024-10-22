public class SecondMinMax {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 7, 5};
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE, secondMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i < min) { secondMin = min; min = i; }
            else if (i < secondMin && i != min) secondMin = i;

            if (i > max) { secondMax = max; max = i; }
            else if (i > secondMax && i != max) secondMax = i;
        }

        System.out.println("Second min: " + secondMin + ", Second max: " + secondMax);
    }
}
