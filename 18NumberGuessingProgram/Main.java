
import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String [] args){

        //Number Guessing Game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userNumber= 0;
        int selectedNumber = random.nextInt(1,101);
        int attemps =3;
        System.out.println("*************************************");
        System.out.println("Welcome to the Number Guessing Game");
        System.out.print("Enter a number between 1-100 Attemp Count 3! --> ");
        while(userNumber != selectedNumber && attemps !=0){
                userNumber = scanner.nextInt();
                if(Math.abs(userNumber-selectedNumber) > 20){
                    System.out.println("It's so Cold!!! try it --> ");
                }else if(Math.abs(userNumber-selectedNumber) <=20 && Math.abs(userNumber-selectedNumber) >10){
                    System.out.println("It's Cold try it --> ");
                }else if(Math.abs(userNumber- selectedNumber) <=10 && Math.abs(userNumber-selectedNumber) >5){
                    System.out.println("It's Hot try it --> ");
                }
                else if(Math.abs(userNumber-selectedNumber) <=5){
                    System.out.println("It's so Hot!!! try it --> ");
                }
                 attemps--;   
                System.out.println("You got "+attemps+ " attemps!");
                

        }
        if(attemps == 0){
            System.out.print("You couldn't find out NEXT TIME ::/( ");
        }else{

        System.out.print("Congratulations!! you find out: "+selectedNumber+"!!");
        }     

    }
}