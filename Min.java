public class Min {
    public static void main(String[] args) {
        int[]arr={2,5,1,3,0};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= min){
                min=arr[i];
            }

        }
        System.out.print("the min element of the given array is :"+min);
    }
}
