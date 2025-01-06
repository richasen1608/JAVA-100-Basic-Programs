public class Sum2 {
    //to find pair of elements whose sum is qual to specified input
    static void pairvalue(int[] arr, int input){
        System.out.println("the pair of elements and their sum :");
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==input){
                    System.out.println(arr[i]+"+"+arr[j]+"="+input);
                }

            }
        }

    }

    public static void main(String[] args) {
        pairvalue(new int[]{2,7,8,1,11,12}, 9);
        pairvalue(new int[]{2,3,8,1,4,1}, 5);
    }
}
