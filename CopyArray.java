import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println("THE ORIGINAL ARRAY  IS : " + Arrays.toString(arr));
        int[]newArr= new int[4];
        newArr=arr;
        System.out.println("THE COPIED ARRAY IS : "+Arrays.toString(newArr));

    }
}
