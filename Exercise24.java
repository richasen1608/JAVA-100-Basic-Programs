import java.util.Scanner;

public class Exercise24 {
    //Write a Java program that takes three numbers from the user and prints the greatest number.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER : ");
        int num1= sc.nextInt();

        System.out.println("ENTER THE SECOND NUMBER : ");
        int num2= sc.nextInt();

        System.out.println("ENTER THE THIRD NUMBER : ");
        int num3= sc.nextInt();

        if(num1>num2)
            if(num1>num3)
                System.out.println("THE GREATEST NUMBER IS "+num1);

        if(num2>num1)
            if(num2>num3)
                System.out.println("THE GREATEST NUMBER IS "+num2);

        if(num3>num1)
            if(num3>num2)
                System.out.println("THE GREATEST NUMBER IS "+num3);

    }
}
