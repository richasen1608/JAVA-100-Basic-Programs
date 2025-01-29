public class Binary {
    public static void main(String[] args) {
        int arr[]={1,8,9,10,16,18};
        int target=16;
        int result=Search(arr,target);
        if(result!=-1)
            System.out.println("element found at index :"+result);
        else
            System.out.println("element not found");

    }
    public static int Search(int[]arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else right=mid-1;
        }
        return -1;
    }
}
