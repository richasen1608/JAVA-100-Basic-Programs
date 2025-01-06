import java.util.Scanner;

public class Exercise28 {
    //Display the n terms of odd natural number and their sum
    public static void main(String[] args) {
        int i,n,sum=0;
        System.out.println("enter the number of terms :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("the odd numbers are:");
        for(i=0;i<=n;i++){
            System.out.println(2*i-1);
            sum+=2*i-1;
        }
        System.out.println("the sum of odd natural numbers are "+sum);


    }


}
