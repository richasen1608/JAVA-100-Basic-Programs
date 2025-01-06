import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        System.out.println("input the num whose table you want to calculate :");
        int i,n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();

        for(i=1;i<=10;i++){
            System.out.println(n+" * " +i+ " = " +n*i);
        }
    }
}
