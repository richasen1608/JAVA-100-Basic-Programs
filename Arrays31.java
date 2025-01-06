import java.util.Arrays;

public class Arrays31 {
    public static void main(String[] args) {
        int[]arr={10,77,10,4,10,79};
        System.out.println("OTIGINAL ARRAY IS :  "+ Arrays.toString(arr));
        int search_num =10;
        int fix_sum=30;
        System.out.println("RESULT IS : "+ result(arr,search_num,fix_sum));
    }
    public static boolean result(int[]arr, int search_num,int fix_sum){
        int temp_sum=0;
        for(int num:arr){
            if(num == search_num){
                temp_sum += search_num;
            }
            if(temp_sum > fix_sum){
                break;
            }
        }
        return temp_sum == fix_sum;
    }
}
