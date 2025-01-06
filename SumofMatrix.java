import java.util.Scanner;

public class SumofMatrix {
    public static void main(String[] args) {
        int r, c, m, p;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE ROWS : ");
        r = sc.nextInt();

        System.out.println("ENTER THE COLUMNS : ");
        c = sc.nextInt();

        //CREATING ARRAY

        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];
        int[][] sum = new int[r][c];

        System.out.println("INPUT THE ELEMNTS FOR MATRIX 1");
        for (m = 0; m < r; m++) {
            for (p = 0; p < c; p++) {
                arr1[m][p] = sc.nextInt();
            }
        }

        System.out.println("INPUT THE ELEMNTS FOR MATRIX 2");
        for (m = 0; m < r; m++) {
            for (p = 0; p < c; p++) {
                arr2[m][p] = sc.nextInt();

            }
        }

        System.out.println("THE SUM OF MATRIX :");
        for (m = 0; m < r; m++) {
            for (p = 0; p < c; p++) {
                sum[m][p] = arr1[m][p] + arr2[m][p];

            }
        }
        System.out.println("THE SUM IS :");
        for (m = 0; m < r; m++) {
            for (p = 0; p < c; p++) {
                System.out.print(sum[m][p] + "\t");
            }
            System.out.println();
        }
    }
}



