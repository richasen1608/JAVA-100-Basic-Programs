public class MinVal {
    public static void main(String[] args) {
        int[]myarr={2,3,4,5,6};

        int minval=myarr[0];


        for(int i:myarr){
            if (i<minval){
                minval=i;
            }
        }
        System.out.println("the lowest element in array is :"+minval);
    }

}
