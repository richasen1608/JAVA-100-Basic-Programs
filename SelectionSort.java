public class SelectionSort {
    public static void main(String[] args) {
        int[]arr={20,18,6,33,5,9,1};
        int n=arr.length;

        for(int i=0;i<n;i++){
           int min=i;
           for(int j=i+1;j<n;j++){
               if(arr[j]<arr[min]){
                   min=j;
               }
           }
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;


        }
        System.out.println( "the sorted array is :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }

}




