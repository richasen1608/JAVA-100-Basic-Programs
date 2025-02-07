import java.util.Scanner;

public class SwitchFruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String fruit=sc.next();
        /*switch (fruit){
        case "mango":
            System.out.println("king of all");
            break;

        case "apple":
            System.out.println("sweet fruit");
            break;
        case "grapes":
            System.out.println("tangy fruit");

        default:
            System.out.println("enter a valid fruit");
    }

         */
    int day= sc.nextInt();
    switch (day){
        case 1-> System.out.println("monday");
        case 2-> System.out.println("tuesday");
        case 3-> System.out.println("wednesday");
        case 4-> System.out.println("thursday");
        case 5-> System.out.println("friday");
        case 6-> System.out.println("saturday");
        case 7-> System.out.println("sunday");
    }

    }
}
