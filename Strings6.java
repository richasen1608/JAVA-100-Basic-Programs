public class Strings6 {
    public static void main(String[] args) {
        char[] arr=new char[]{ '1','2','3','4','5'};
        String str= String.copyValueOf(arr,1,3);
        System.out.println("\nThe book contains : "+ str + " pages.\n");

    }
}
