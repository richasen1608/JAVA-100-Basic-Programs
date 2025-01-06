public class minimum {
    public int mimi(int[] arr) {
        if(arr== null || arr.length==0){
            throw new IllegalArgumentException("invalid input");
        }

        int min=arr[0];//min will hold minimum value of array
        for(int i=1;i<arr.length;i++){
            if( arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int[] arr={5,9,7,2,6};
       minimum ma=new minimum();
        System.out.println(ma.mimi(arr));
    }
}
