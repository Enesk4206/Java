import java.util.Scanner;
public class Main{

    public static void main(String[] args){

        // && = AND
        // || = OR
        // !  = NOT

        // int temp = -1;
        // boolean isSunny = false;

        // if(temp >= 0 && temp <=30 && isSunny){
        //     System.out.println("The Weather is good :))");
        //     System.out.println("It is sunny outside!");
        // }else if(temp >= 0 && temp <=30 && !isSunny){
        //     System.out.println("The Weather is good :))");
        //     System.out.println("It is cloudy outside!");
        // }else if(temp >30 || temp <0){
        //     System.out.print("The weather is bad :(");
        // }

        //username must be between 4-12 characters
        //username must not contain spaces or underscores

        Scanner  scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if(username.length() <= 12 && username.length() >= 4){
            if(username.contains(" ") || username.contains("_")){
                System.out.println("Username must not contain spaces or underscores");
            }else{
                System.out.println("Hello "+username + "!");
            }

        }else{
            System.out.print("Username characters must be between 4-12");
        }


        scanner.close();

    }
}