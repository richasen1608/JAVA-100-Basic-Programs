public class average {
    public static void main(String[] args) {
        int[]arr=new int[]{8,20,15,19,77,4};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        double avg=sum/ arr.length;
        System.out.println("the avg of numbers is :"+avg);
    }

}
