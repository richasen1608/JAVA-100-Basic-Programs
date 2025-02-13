import java.util.Scanner;

public class fibo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the position ");
        int n= sc.nextInt();

        System.out.println(Fibonacci(n));
    }
    private static long Fibonacci(int n){
        if(n<=1){
            return n;
        }
        return (Fibonacci(n-1) + Fibonacci(n-2));
    }

}
