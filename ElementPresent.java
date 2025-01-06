public class ElementPresent {
    public static boolean contains(int arr[],int item){
        for(int n:arr){
            if ( item==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={200,300,500,600,700,800};
        System.out.println(contains(arr,300));
        System.out.println(contains(arr,400));

    }

}
