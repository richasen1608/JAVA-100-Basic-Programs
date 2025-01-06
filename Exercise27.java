import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        int i,n=0,s=0;
        double avg;

        System.out.println("input 5 nums:");
        for(i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();

            s+=n;
        }
        avg=s/n;
        System.out.println("sum is : "+s+ "avg is "+avg);
        }
    }

