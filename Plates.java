public class Plates {
    public static void main(String[] args) {
        int[]plates={1,2,0,3,0,4,0,0,9,0};
        int[]result=organized(plates);
        System.out.println("the organized plates are : ");
        for(int plate:result){
            System.out.print(plate+" ");
        }
    }
    public static int [] organized(int[] plates){
        int count=0;
        int n=plates.length;
        for (int i = 0; i < n; i++) {
            if(plates[i]!=0){
                plates[count++]=plates[i];
            }

        }
        while(count<n){
            plates[count++]=0;

        }
        System.out.println("count of plates :"+count);
        System.out.println("empty plates are :"+(n-count));
        return plates;
    }
}
