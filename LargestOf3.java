public class LargestOf3 {
    public static void main(String[] args) {
        int a=3, b=10,c=8;
        int largest=a;
        if(b>largest){
            largest=b;
            System.out.println("largest number is "+b);
        }
        if( c>largest){
            largest=c;
            System.out.println("largest number is "+c);
        }
    }
}
