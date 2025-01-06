import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT THE FIRST NUMBER : ");
        double x=sc.nextDouble();

        System.out.println("INPUT THE SEC NUMBER : ");
        double y=sc.nextDouble();

        System.out.println("INPUT THE THIRD NUMBER : ");
        double z=sc.nextDouble();

        if(x<y && y<z){
            System.out.println("INCREASING ORDER ");
        } else if (x>y && y>z) {
            System.out.println("DECREASING ORDER ");

        }
        else{
            System.out.println("NEITHER INCREASING NOR DECREASING ");
        }
    }
}
