public class Exercise20 {
    // fibonacci series
    public static int calculateFibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        return calculateFibo(n-1)+calculateFibo(n-1);
    }


    public static void main(String[] args) {
        int position=3;
        int fibo=calculateFibo(position);
        System.out.println("the fibonacci number at position " +position+ "is :"+ fibo);


    }
}
