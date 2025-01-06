public class Strings8 {
    //Write a Java program to check whether two String objects contain the same data.
    public static void main(String[] args) {
        String col1="I love to read books";
        String col2="I love to eat Pizza";
        String col3="I love to play Chess";

        boolean equals1 = col1.equals(col2);
        boolean equals2 = col1.equals(col3);

        System.out.println("\"" + col1 + "\" equals \"" +
                col2 + "\"? " + equals1);
        System.out.println("\"" + col1 + "\" equals \"" +
                col3 + "\"? " + equals2);


    }
}
