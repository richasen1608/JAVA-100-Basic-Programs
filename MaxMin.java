public class MaxMin {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,100};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("the maximum element of element is : "+max);
        System.out.println("the maximum element of element is : "+min);

    }
}
