public class MaxMinDiff {
    public static void main(String[] args) {
        int[]arr={2,9,1,10,3,7};
        System.out.println("THE ARRAY IS "+arr);
        int n= arr.length;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){

            if(arr[i]>max){
                max=arr[i];
            }

            else if(arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println("THE DIFFERENCE OF MAX AND MIN ELEMENT OF THE ARRAY IS :"+(max-min));

    }
}
