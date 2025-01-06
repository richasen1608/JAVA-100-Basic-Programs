import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");//enter the number to check if it is prime or not
        Scanner scanner=new Scanner(System.in);// take input from the user
        int num = scanner.nextInt();


        if (isPrime(num)) {
            System.out.println(num + "is a prime num");
        } else {
            System.out.println(num + "is not a prime num");
        }
    }
    public static boolean isPrime(int num)//method initialization
    {
        if (num <= 1) {
            return false;// if number is less than 1 or equal to 1 return false
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}




