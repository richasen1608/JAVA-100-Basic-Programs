public class Strings5 {
    public static void main(String[] args) {
        String str1="hello", str2= ("Hello") ;
        CharSequence cs="hello";
        System.out.println("Comparing " +str1 + " and " + cs+ ":" + str1.contentEquals(cs));
        System.out.println("Comparing "+str1 + " and " +cs+ ":" + str2.contentEquals(cs));


    }
}
