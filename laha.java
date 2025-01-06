import java.util.Arrays;

public class laha {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        swap(arr, 0, 2);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int [] arr, int index0, int index2){
        int temp=arr[index0];
        arr[index0]=arr[index2];
        arr[index2]=temp;

    }
}



