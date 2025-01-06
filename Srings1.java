public class Srings1 {
    public static void main(String[] args) {
        String str=("I love Java Programming");
        System.out.println(str);
        int val1= str.codePointAt(1);
        int val2=str.codePointAt(2);
        System.out.println("Character(unicode point)=" +val1);
        System.out.println("character(unicode point)=" +val2);
    }
}
