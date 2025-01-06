import java.util.Arrays;
import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number bn 1 and 20");
        int n= sc.nextInt();

        while(n>20 || n <0){
            System.out.println("invalid number, try again");
            n=sc.nextInt();
        }
        int[] nums=new int[n];
        fillArrayOfIntegers(nums);
        printArrayOfIntegers(nums);




    }

    private static void printArrayOfIntegers(int[] nums) {
        System.out.println("the elements are: ");
        System.out.println(Arrays.toString(nums));
    }

    private static void fillArrayOfIntegers(int[] nums) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<nums.length;i++)
            nums[i]=sc.nextInt();
    }


}
