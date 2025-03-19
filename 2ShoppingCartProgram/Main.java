
import java.util.Scanner;

public class Main{

    public static void main(String [] args){

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;


        Scanner input = new Scanner(System.in);

        System.out.print("What item would you like to buy: ");
        item = input.nextLine();
        System.out.print("What is the price for each? : ");
        price = input.nextDouble();
        System.out.print("How many dou you like:");
        quantity = input.nextInt();

        total = quantity * price;

        System.out.println("Your order is a/an :"+ item);
        System.out.println("It costs:"+ currency+ total);




        input.close();

    }
}