
import java.util.Scanner;

public class Main{

    public static void main(String [] args){

        //Search an array

        Scanner scanner = new Scanner(System.in);
        int[] numbers = {3,5,12,244,1122,32,44};
        String[] colors = {"blue", "red", "green", "black", "white", "purple"};
        System.out.print("Enter your search key: ");
        String target = scanner.nextLine();
        boolean isFound = false;

        for(int i = 0; i< colors.length; i++){
            // if(numbers[i] == target){
            //  if(colors[i].equals(target)){
            if(colors[i].equals(target)){
                System.out.print("The target value in "+i+ " index");
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.print("Invalid value has not founded");
        }
        
        scanner.close();



    }
}