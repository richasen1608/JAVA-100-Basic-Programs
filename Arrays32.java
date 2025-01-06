import java.util.Arrays;

public class Arrays32 {
    public static void main(String[] args) {
        int arr[]={30,40,67,65,42};
        System.out.println("THE ORIGINAL ARRAY IS : "+ Arrays.toString(arr));
        int num1=67;
        int num2=65;
        System.out.println("THE RESULT "+result (arr,num1,num2));
    }
    public static boolean result(int[] arr, int num1,int num2){
        for(int num :arr){
            boolean r = num != num1 && num!= num2;
            if(r){
                return false;
            }
        }
        return true;
    }
}
