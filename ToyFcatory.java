public class ToyFcatory {
    public static void main(String[] args) {

        int boxes[]={1,0,2,0,3,0,4,0,5,0};
        int emptyBoxCount=moveEmptyBox(boxes);
        System.out.println("modified boxes : ");
        for (int i :boxes) {
            System.out.print(i+" ");
        }
        System.out.println("the count of empty boxes : "+emptyBoxCount);
    }
    public static int moveEmptyBox(int[]boxes){
        int pos=0;
        int count=0;
        for(int i:boxes){
            if(i!=0){
                boxes[pos]=i;
                pos++;
            }
            else{
                count++;
            }
        }
        for(int p=pos;p<boxes.length;p++){
            boxes[p]=0;
        }
        return count;

    }
}
