public class stringfunction {
    public static void main(String[] args) {
        String text =myGreet("Richa Sen");
        System.out.println(text);
        /*String text=greet();
        System.out.println(text);

    }
    static String greet(){
        String greet="how r uuuu";
        return greet;

         */


    }

    static String myGreet(String name){
        String message="hello "+name;
        return message;
    }
}

