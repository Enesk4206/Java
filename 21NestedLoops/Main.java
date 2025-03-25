
import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        
        //nested loop = a loop inside another loop
        //used often with matrices and DS&A


        // for(int i = 0; i<5; i++){
        //     for(int j = 0; j<5; j++){
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }


        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the charachter of matris: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i<rows; i++ ){
            for(int k =0; k <columns; k++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();

    }
}