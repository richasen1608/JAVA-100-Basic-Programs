
//Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.
import java.sql.SQLOutput;
import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int arr[]={10,3,4,5,7,2,8};
        int result[];
        System.out.println("The original array is : ");
        System.out.println(Arrays.toString(arr));
        result= separate_odd_even(arr);
        System.out.println("AFTER SEPARATION THE RESULT IS ");
        System.out.println(Arrays.toString(result));
    }
    // method to separate odd n even
    static int[] separate_odd_even(int arr[]){
        // initialize left and right pointers
        int left=0,right= arr.length - 1;
        while(left < right){
            while(arr[left]%2 ==0 && left<right)
                left++;
            while(arr[right]%2 == 1 && left<right)
                right--;
            if(left<right){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return arr;

    }
}
