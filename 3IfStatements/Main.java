
import java.util.Scanner;

public class Main{

    public static void main (String [] args){

        //If Statement if condition is true

        Scanner scanner = new Scanner(System.in);

        int yearsOfAhmet;
        String name;
        boolean isStudent;

        System.out.println("Please Enter Your Name");
        name = scanner.nextLine();
        System.out.println("Please write your age: ");
        yearsOfAhmet = scanner.nextInt();
        System.out.println("Are you student: (true/false)");
        isStudent = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("You didn't write your name!");
        }
        else{
            System.out.println("Hello "+name+ "!");
        }


        if(yearsOfAhmet >= 18){
            System.out.println("You are an adult!");
        }
        else if(yearsOfAhmet < 18 && 0 < yearsOfAhmet){
            System.out.println("You are a child!");
        }else if(yearsOfAhmet == 0){
            System.out.println("You are a Baby!");
        }
        
        else{
            System.out.println("You aren't born yet!");
        }

        if(isStudent){
            System.out.println("You are a student");
        }else{
            System.out.println("You aren't student");
        }


    

        scanner.close();

    }


}