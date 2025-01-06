public class Exercise22 {
    public static int calculateGCD(int num1,int num2){
        if(num2==0){
            return num1;
        }
        int rem=num1%num2;
        return calculateGCD(num2, rem);
    }


    public static void main(String[] args) {
        int num1=190;
        int num2=9;
        int gcd=calculateGCD(num1,num2);
        System.out.println("the gcd of "+num1+" "+num2+" is "+gcd);
    }
}
