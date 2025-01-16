public class Exercise1 {

    public static void main(String[] args) {
        int[]arr=new int[]{10,20,30,40,50};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+ arr[i];
        }
        double avg = sum/ arr.length;
        System.out.println("the average value is :" +avg);
    }
}

