import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        int i,j,n;
        System.out.println("INPUT THE NUMBER ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            for(j=0;j<=i;j++)
                System.out.print(i);
            System.out.println("");
        }
    }
}
