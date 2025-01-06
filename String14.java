public class String14 {
    //java program to check if the given string starts withthe conetents of another string
    public static void main(String[] args) {
        String str1="Red is my fav colour ";
        String str2="Violet is my fav colour ";
        String start="Violet";
        boolean start1=str1.startsWith(start);
        boolean start2=str2.startsWith(start);

        System.out.println(str1+"starts with "+start+ " ? " +start1);
        System.out.println(str2 +"starts with "+start+" ? " +start2);
    }
}
