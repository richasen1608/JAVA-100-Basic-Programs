import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArrList {
    public static void main(String[] args) {
        String[]arr={"richa","soham","raj","neha","manab"};
        ArrayList list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}
