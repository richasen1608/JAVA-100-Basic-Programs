public class String10 {
    //java program to check is the two string object contain same data

    public static void main(String[] args) {
        String col1="Richa Sen";
        String col2="Manab Sen";
        String col3="Neha Sen";
        String col4="Richa Sen";

        boolean equals1=col1.equals(col2);
        boolean equals2=col1.equals(col3);
        boolean equals3=col1.equals(col4);

        System.out.println(col1 + " equals " +col2 +equals1);
        System.out.println(col1 + " equals " +col3 +equals2);
        System.out.println(col1 + " equals "+ col4+equals3);
    }

}
