import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("input the floating point number");
        double x= sc.nextDouble();
        System.out.println("input the other floating point number");
        double y=sc.nextDouble();

        x=Math.round(x*1000);
        x=x/1000;

        y=Math.round(y*1000);
        y=y/1000;

        if(x==y){
            System.out.println("they are same upto 3 decimal places");

        }
        else{
            System.out.println("they are different");
        }
    }
}
