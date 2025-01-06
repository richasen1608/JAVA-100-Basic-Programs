import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // create an array list to store integers
        ArrayList<Integer>nums=new ArrayList< >(List.of(10,20,30,40,50,60));

        //access and print elements from array list
        System.out.println("ELEMENT AT INDEX 0 :"+nums.get(0));
        System.out.println("ELEMENT AT INDEX 2: "+nums.get(2));
        System.out.println("ELEMENT AT INDEX 4:"+nums.get(4));

        int sum=nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println("SUM OF ARRAYLIST ELEMENTS:"+sum);

        //updating elements
        nums.set(2,25);
        System.out.println("ELEMENT UPDATED AT 2nd INDEX IS :" +nums.get(2));
        System.out.println("ELEMENTS IN ARRAY LIST IS:");
        for(int number:nums)
        {
            System.out.println(number);
        }


    }
}
