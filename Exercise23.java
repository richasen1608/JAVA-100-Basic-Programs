import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT THE NUMBER :");
        int day= sc.nextInt();
        System.out.println(getDayName(day));

    }
    public static String getDayName(int day){
        String dayName="";
        switch(day){
            case 1:dayName="MONDAY";break;
            case 2:dayName="TUESDAY";break;
            case 3:dayName="WEDNESDAY";break;
            case 4:dayName="THURSDAY";break;
            case 5:dayName="FRIDAY";break;
            case 6:dayName="SATURDAY";break;
            case 7:dayName="SUNDAY";break;
            default:dayName="Invalid day range";

        }
        return dayName;
    }
}
