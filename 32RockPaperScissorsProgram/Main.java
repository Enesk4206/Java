
import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String [] args){

        // Rock Paper Scissors Game

        // declare variables
        // get choice from user
        // get random choice for the computer
        // check win conditions
        // ask to play again?
        // goodby message


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String [] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{

            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;   //döngöyü baştan başlat
            }

            computerChoice = choices[random.nextInt(3)]; //0,1,2 herhangi birini seç
            System.out.println("Computer choice is: "+ computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It' a tie");
            }else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("You win!");
                
            }else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
                
            }
            else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You win!");
                
            }
            else if (playerChoice.equals("rock") && computerChoice.equals("paper")) {
                System.out.println("You lose!");
                
            }
            else if (playerChoice.equals("papper") && computerChoice.equals("scissors")) {
                System.out.println("You lose!");
                
            }
            else if (playerChoice.equals("scissors") && computerChoice.equals("rock")) {
                System.out.println("You lose!");
                
            }
            //isteseydik tek bir if içerisinde yada operatörünü kullanarak true ifadelerini geçip else ile de kalanları girebilirdik

            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
            

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for played");
    }
}