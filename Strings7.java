public class Strings7 {
    public static void main(String[] args) {
        String str1="Hello  Friend ";
        String str2="Heyy Friend ";

        String end_str="end";
        boolean end1 = str2.endsWith(end_str);
        boolean end2 = str2.endsWith(end_str);
        System.out.println(str1 + "ends with " + end_str+end1);
        System.out.println(str2 + "ends with  " + end_str+end2);

    }
}
