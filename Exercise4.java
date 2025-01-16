import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
            int m,n,c,d;

            //create scanner obj:
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE  NUMBER OF ROWS OF MATRIX");
        m= sc.nextInt();
        System.out.println("ENTER THE  NUMBER OF COLUMNS OF MATRIX");
        n= sc.nextInt();

        int array1[][]=new int[m][n];
        int array2[][]=new int[m][n];
        int sum[][]=new int[m][n];

        //taking input elements of first matix
        System.out.println("Input elements of first matrix");

        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                array1[c][d]=sc.nextInt();
            }
        }
        // for second matrix
        System.out.println("Input elements of second matrix");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                array2[c][d]=sc.nextInt();
            }
        }
        //calculate the sum of matrix :
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                sum[c][d]=array1[c][d]+array2[c][d];
            }
        }








        // display the sum
        System.out.println("the sum of matrices are : " );
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                System.out.println(sum[c][d]+ "\t");
            }
            System.out.println();
        }


    }




}
