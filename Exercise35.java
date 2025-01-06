public class Exercise35 {
    //exception handling
    public static void main(String[] args) {
        try {
            int result = divideNUm(5, 0);
            System.out.println("result : " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static int divideNUm(int dividend, int divisior) {
        if (divisior == 0) {
            throw new ArithmeticException("cannot divide any number by 0 ");

        }
        return dividend / divisior;
    }
}
