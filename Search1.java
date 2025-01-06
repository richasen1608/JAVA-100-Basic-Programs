import java.util.Scanner;

public class Search1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many values you want?");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+"values:");
        for (int i =0; i<arr.length; i++)
            arr[i]= sc.nextInt();
        System.out.println("enter the target number");
        int target=sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if( arr[i]==target){


                break;

            }

            }
        }
    }

