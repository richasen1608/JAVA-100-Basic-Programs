import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        int number=12345;
        int reverseNum=0;
        while(number !=0){
            int rem=number%10;
            reverseNum=reverseNum*10+rem;
            number=number%10;

        }
        System.out.println("reversed number is "+reverseNum);

    }
}
