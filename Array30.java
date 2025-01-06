import java.util.Arrays;

public class Array30 {
    public static void main(String[] args) {
        int[]arr={20,11,32,45,9};
        System.out.println("THE ORIGINAL ARRAY IS : "+ Arrays.toString(arr));
        System.out.println("RESULT "+test(arr));

    }
    //declaring method test
    public static boolean test(int[] nums){
        for(int num:nums){
            if(num==0 || num==-1){
                return false;
            }
        }
        return true;
    }
}
