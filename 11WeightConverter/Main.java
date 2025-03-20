
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //paramteres
        double weight;
        int option;

        //1 pound = 0.45359237kg
        //1 kg = 2.20462262lbs
        Scanner scanner =new Scanner(System.in);

        System.out.println("Weight Conversion Program");
        System.out.print("1: Convert lbs to kg \n");
        System.out.print("2: Convert kg to lbs \n");

        System.out.println("Choose an option: ");
        option = scanner.nextInt();

        if(option == 1){
            //Convert lbs --> kg
            System.out.print("Please enter lbs:");
            weight = scanner.nextDouble();
            weight =  weight *  0.45359237;
            System.out.print("You are " + weight + "kg");
        }else if(option ==2 ){
            //Convert kg --> lbs
            System.out.print("Please enter kg:");
            weight = scanner.nextDouble();
            weight = weight * 2.20462262;
            System.out.print("You are "+ weight+ "lbs");

        }else{
            System.out.println("Please enter the validate option ( enter -> 1 or 2) ");
        }

        scanner.close();
        
        
    }
}