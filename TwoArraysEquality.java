public class TwoArraysEquality {
    static void equality_check(int[] arr1, int[] arr2) {
        boolean equalOrNot = true;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equalOrNot = false;
                }
            }

        } else {
            equalOrNot = false;
        }
        if (equalOrNot) {
            System.out.println("the arrays are equal");
        } else {
            System.out.println("arrays are not equal");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        equality_check(arr1, arr2);
    }
}
