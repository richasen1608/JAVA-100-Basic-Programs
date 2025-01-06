import java.sql.SQLOutput;

public class ArrayExample {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50};
        System.out.println("ELEMENT AT 0 INDEX IS :" + nums[0]);
        System.out.println("ELEMENT AT INDEX 2 IS :"+nums[2]);

        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        System.out.println("THE SUM OF NUMBERS OF ARRAY IS :"+sum);
        nums[3]=100;//updating an element

        System.out.println("LET ELEMENT AT 3rd INDEX BE: "+nums[3]);

        System.out.println("ELEMENTS OF THE ARRAY ARE :");
        for(int number:nums)
        {
            System.out.println(number);
        }
    }
}
