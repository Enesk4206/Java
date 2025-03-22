
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a day of week (Monday-Sunday)");
       String day = scanner.nextLine();

       switch (day){
        case "Monday" -> System.out.print("This is a weekday!");
        case "Tuesday" -> System.out.print("This is a weekday!");
        case "Wednesday" -> System.out.print("This is a weekday!");
        case "Thursday" -> System.out.print("This is a weekday!");
        case "Friday" -> System.out.print("This is a weekday!");
        case "Saturday" ->System.out.print("This is a weekend :)!");
        case "Sunday" -> System.out.print("This is a weekend :)!");
        default -> System.out.print("Enter a day of week  between monday to sunday");
       }    
    

    }
}