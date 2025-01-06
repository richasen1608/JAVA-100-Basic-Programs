import java.util.ArrayList;

public class ArraylistToArray {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        list.add("richa");
        list.add("neha");
        list.add("manab");
        list.add("soham");
        list.add("meera");

        String[]arr=new String[list.size()];
        list.toArray(arr);

        for(String string :arr){
            System.out.println(string);
        }

    }
}
