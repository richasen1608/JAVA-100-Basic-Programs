public class String9 {
    public static void main(String[] args) {
        char[] arr=new char[]{'1','2','3','4'};
        //Create a String containing the contents of arr_num
        // starting at index 1 for length 3.
        String str=String.copyValueOf(arr,1,3);
        System.out.println("\nThe book contains "+str+" pages.\n");
    }
}
