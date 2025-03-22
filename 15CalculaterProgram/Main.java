
import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        int firstNumber;
        int secondNumber;
        char operator;
        String error;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1.Number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter operator: ");
        operator = scanner.next().charAt(0);
       

        if(operator == '/' || operator == '*' || operator == '+' || operator == '-'){
            //işlemler

            System.out.print("Enter 2.Number: ");
            secondNumber = scanner.nextInt();

            

            switch(operator){
                case '+' -> System.out.println("Result-> "+ (firstNumber+secondNumber));
                case '-' -> System.out.println("Result-> "+ (firstNumber-secondNumber));
                case '/' -> {
                    if(secondNumber == 0){
                        System.out.print("Can not divide by zero!");
                    }else{
                        System.out.print("Result-> " + (firstNumber/secondNumber));
                    }
                }
                case '*' -> System.out.println("Result-> "+ (firstNumber*secondNumber));
        
            }
        }else{
            System.out.println("Please enter validate process operators (/, *, +, -) choice any operator  ");
            }


        scanner.close();

    }
}