import java.util.OptionalInt;

public class FindArrayIndex {
    public static OptionalInt findIndex(int []arr,int t) {
        if (arr == null)

            return OptionalInt.empty();
            int n = arr.length;
            int i = 0;
            while (i < n) {
                if (arr[i] == t)
                    return OptionalInt.of(i);
                else i = i + 1;
            }
            return OptionalInt.empty();

    }

    public static void main(String[] args) {
        int[]arr={55,66,77,11,22,33,88,99};
        findIndex(arr,77).ifPresent(index -> System.out.println("INDEX POSITION OF 77 IS : "+index));
        findIndex(arr,22).ifPresent(index -> System.out.println("INDEX POSITION OF 22 IS : "+index));
        findIndex(arr,55).ifPresent(index -> System.out.println("INDEX POSITION OF 55 IS : "+index));


    }
}
