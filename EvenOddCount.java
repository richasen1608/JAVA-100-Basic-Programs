public class EvenOddCount {
    public static void main(String[] args) {
        int[]arr={4,7,9,2,5,6,9,10,6,2,12};
        System.out.println("THE ORIGINAL ARRAY IS :"+arr);
        // declare ctr var to store even num count
        int ctr=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] %2 ==0){
                ctr++;
            }

        }
        System.out.println("THE NUMBER OF EVEN ELEMENTS ARE :"+ctr);
        System.out.println("THE NUMBER OF ODD ELEMENTS ARE :"+( arr.length-ctr));


    }
}
