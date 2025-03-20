
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        /// Sıcaklık çevirimi 
        /// F = (C*1.8) + 32
        ///
        

        double temp;
        String option;
        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choice temperature type to convertion (f or c): ");
        option = scanner.nextLine();
        System.out.print("Enter the Temperature: ");
        temp = scanner.nextDouble();

        result = (option.equals("f"))
        ? (temp = (temp * 1.8)+ 32)   
        : (option.equals("c"))  ? (temp = (temp-32) /1.8) : 12 ;

        System.out.printf("%.2f",result);

        scanner.close();

    }
}