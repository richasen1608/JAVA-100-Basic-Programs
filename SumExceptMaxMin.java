import java.util.Arrays;

public class SumExceptMaxMin {
    //to find the sum of the elements of a array except the max and the min
    public static void main(String[] args) {
        int arr[]={5,2,18,9,1};
        System.out.println("THE ORIGINAL ARRAY IS"+ Arrays.toString(arr));
        int max=arr[0];
        int min=arr[0];
        float sum=arr[0];

        for(int i=0;i< arr.length;i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
            float x = ((sum-max-min)/(arr.length-2));


        System.out.printf("THE AVG SUM OF ARRAY EXCEPT THE MAX AND MIN ELEMENT IS: %.2f ", x);
        System.out.println("\n");

        }

    }

