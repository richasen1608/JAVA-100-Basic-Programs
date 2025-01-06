import java.sql.SQLOutput;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        System.out.println("ORIGINAL ARRAY IS : "+ Arrays.toString(arr));
        int removeIndex=1;
        for(int i=1;i< arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("AFTER THE REMOVAL OF 2ND ELEMENT THE ARRAY IS :"+ Arrays.toString(arr));



    }
}
