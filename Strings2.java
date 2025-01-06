public class Strings2 {
    public static void main(String[] args) {
        String str1=("This is an exercise ");
        String str2=("This is an exercise ");

        System.out.println("The first string is: " +str1);
        System.out.println("The second string is "+str2);

        int result=str1.compareTo(str2);
        if(result < 0){
            System.out.println("str1 is equal  str2");
        }
        else{
            System.out.println("str1 is greater than str2");
        }

  }
}