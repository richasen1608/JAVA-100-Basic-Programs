public class Execise19 {
    public static int calculateSum(int n){
        if(n==0){
            return 0;
        }
        return n + calculateSum(n-1);
    }


    public static void main(String[] args) {
        int number=7;
        int sum=calculateSum(number);
        System.out.println("sum of numbers from "+number+ "  are " +sum);
    }
}
