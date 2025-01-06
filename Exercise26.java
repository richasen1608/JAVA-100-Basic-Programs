import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE YEAR : ");

        int year=sc.nextInt();

        boolean x=(year%4)==0;
        boolean y=(year%100) !=0;
        boolean z=((year%100 ==0) && (year%400==0));

        if(x &&(y||z))
        {
            System.out.println("THE YEAR IS A LEAP YEAR");
        }
        else{
            System.out.println("THE YEAR IS NOT A LEAP YEAR");
        }
    }
}
