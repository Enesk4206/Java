
import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String [] args){

        // Java Slot Machine
 
        // declare variables
        // display welcome message 
        // play if Balance > 0
        // enter bet amount
        // -> verify if bet >balance (bahis miktardan yüksek olamaz)
        // -> verify if bet > 0       (bet 0 ve 0 dan küçük olamaz)
        // -> substract bet from balance    
        // spin row
        // print row
        // get payout
        // ask to play again
        // display exit

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row = {};
        String playAgain;

        System.out.println("************************");
        System.out.println("************************");
        System.out.println("*Welcome to Java Slots!*");
        System.out.println("----------------------- ");
        System.out.println("Symbols 🍒C 🍉W 🍋L 🔔B ⭐S");
        System.out.println("************************");
        System.out.println("************************");

        while(balance > 0){
            System.out.println("Current balance: "+ balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();                //ÖNEMLİ BU NEXTINT ARKADAŞTAN SONRA ALTTAKİ SATIR KODUNU EKLE
            scanner.nextLine();
            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }else if(bet <= 0 ){
                System.out.println("Bet must be greater than 0");
                continue;
            }
            else{
                balance -= bet;
                
            }

            System.out.println("Spinning....");
            row = spinRow();    
            printRow(row);
            payout = getPayout(row,bet);

            if(payout > 0){
                System.out.println("You won $"+payout);
                balance = balance + payout;
            }else{
                System.out.println("Sorry you lost this round.");
            }
            System.out.println("Do you want play again? (Y/N)");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }
        
        System.out.println("GAME OVER! Your final balance is $"+balance);
        scanner.close();

    }

    static String[] spinRow(){
        
        String [] symbols = {"🍒C", "🍉W", "🍋L", "🔔B", "⭐S"};
        String [] row = new String[3];
        Random random = new Random();

        for(int i = 0; i<3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];   
        }

        return row;
    }

    static void printRow(String row[]){
        System.out.println(" "+ String.join(" | ", row));   
    }

    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒C" -> bet *3;
                case "🍉W" -> bet *4;
                case "🍋L" -> bet *5;
                case "🔔B" -> bet *10;
                case "⭐S" -> bet *20;
                default -> 0;
            };
        }

        return 0;
    }
}