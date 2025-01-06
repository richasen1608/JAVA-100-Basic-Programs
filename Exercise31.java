import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        int i,n;
        System.out.println("Input the numbers : ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();

        for(i=0;i<=n;i++){
            System.out.println("The number is : "+i+ " and the cube is :"+(i*i*i));
        }
    }
}
