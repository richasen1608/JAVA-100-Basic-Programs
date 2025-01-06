import java.util.Arrays;
import java.util.HashSet;

public class CommonElement {
    public static void main(String[] args) {
        String []arr1={"JAVA", "PHP", "MYSQL","RUBY","PYTHON"};
        String []arr2={"JAVA", "PHP", "SQL","CSS","HTML"};
        int n= arr1.length;
        int m= arr2.length;
        System.out.println("ARRAYS 1 : "+ Arrays.toString(arr1));
        System.out.println("ARRAYS 2 : "+ Arrays.toString(arr2));
        HashSet set=new HashSet();


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i].equals(arr2[j])){
                    set.add(arr1[i]);
                }
            }
        }
        System.out.println("THE COMMON ELEMENTS IN BOTH ARE :" +(set));

    }
}
