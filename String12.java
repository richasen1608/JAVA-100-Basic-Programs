import java.util.Calendar;

public class String12 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println("Current date and time is :");
        System.out.format("%tB %te, %tY%n",c,c,c);
        System.out.format("%t1:%tM %tp%n", c,c,c);
    }

}
