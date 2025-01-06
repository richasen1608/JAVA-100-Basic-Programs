import java.util.Scanner;

public class Exercise18 {
    // to calculate the factorial of num
    public static int calculateFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*calculateFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=7;

        int factorial=calculateFactorial(num);
        System.out.println("the factorial of num is " +factorial);
        num =12;
        factorial=calculateFactorial(num);
        System.out.println("the factorial of num is "+factorial);
        System.out.println("enter the number whose factorial you want "  );
        num=sc.nextInt();
        factorial=calculateFactorial(num);
        System.out.println(factorial);
    }

}
