public class Duplicate {
    public static void main(String[] args) {
        int []arr={1, 2, 5, 5, 6, 6, 7, 2};
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]==arr[j]) && (i!=j)){
                    System.out.println("THE DUPLICATE ELEMENTS ARE : "+arr[j]);
                }
            }
        }
    }
}
