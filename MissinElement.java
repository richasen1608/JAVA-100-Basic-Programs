import java.util.ArrayList;

public class MissinElement {
    public static void main(String[] args) {
        ArrayList common = new ArrayList();
        int[]arr1={1,2,3,4,5};
        int[]arr2={1,2,3,6,7};
        int[]arr3={1,2,3,8,9};

        int x=0;int y=0;int z=0;

        while(x<arr1.length && y<arr2.length && z< arr3.length);{
            if(arr1[x]==arr2[y] && arr2[y]==arr3[z]){
                common.add(arr1[x]);
                x++;
                y++;
                z++;
            }else if(arr1[x]<arr2[y]){
                x++;
            }
            else if(arr2[x]<arr3[z]){
                y++;
            }else{
                z++;
            }
        }
        System.out.println("common elements for these sorted arrays ");
        System.out.println(common);
    }
}
