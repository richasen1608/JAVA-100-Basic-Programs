import java.util.Arrays;

//Compute the average value of an array of integers except the largest and smallest values
public class Exercise3 {
    public static void main(String[] args) {
        int[]arr={12,19,2,8,10,1,7,20};
        System.out.println("The original array is : "+ Arrays.toString(arr));
        int max=arr[0];
        int min=arr[0];
        float sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];
        }
        float x=((sum-max-min)/ (arr.length-2));
        System.out.printf("Compute the average value of an array of integers except the largest and smallest values: %.2f", x);


        System.out.println("\n");
    }

}
