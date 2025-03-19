
import java.util.Random;



public class Main{
    public static void main(String  [] args){
        

        ///Random number (int) mode
        
        // Random random = new Random();

        // int number1;
        // int number2;
        // int number3;

        // number1 = random.nextInt(1, 7);
        // number2 = random.nextInt(1,101);
        // number3 = random.nextInt(1,7);


        // System.out.println(number1 + ","+ number2 + "," + number3);


        /// Random number (double) mod
        ///
        
        Random random = new Random();

        double numberDouble = random.nextDouble();
        System.out.println(numberDouble);


        /// Random (boolean) state mode

        boolean state = random.nextBoolean();

        if(state){
            System.out.print("I am a hero :)");
        }else{
            System.out.print("I am not Hero :( ");
        }

    }
}