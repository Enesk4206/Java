
import java.util.Scanner;


public class Example{
    public static void main(String [] args){

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Please enter how many you want: ");
        // int orderQuantity= scanner.nextInt();
        // scanner.nextLine();

        // String[] orders = {};
        // orders = new String[orderQuantity];
       
        // for(int i = 0; i<orderQuantity; i++){
        //     System.out.print("Enter what you want: ");
        //     orders[i] = scanner.nextLine();
        // }
        // System.out.println(" ");
        // System.out.println("Customer Orders");
        // for(String orderItems : orders){
        //     System.out.println("------------------");
        //     System.out.println(orderItems);
        // }

        // scanner.close();




        // Scanner scanner = new Scanner(System.in);
        
        // String targetSearch;
        // boolean controller= false;

        // String[] employees = {"Hasan", "Ahmet", "Serdar", "Haci Osman ", "Kemal"};
        // System.out.print("Please Enter what you find out: ");
        // targetSearch = scanner.nextLine();
        

        // for(int i = 0; i<employees.length; i++){

        //     employees[i] = employees[i].trim();
            
        //     if(employees[i].equals(targetSearch)){
        //         System.out.print("Here is a user: "+employees[i]);
        //         controller = true;
        //     }
        // }
        // if(!controller){
        //     System.out.println("There is no one");
        // }


        // scanner.close();



        String [] questions = {"Hangisi Turkiye'nin komsudur?", "Türkiye hangi yıl kuruldu?", "Türkiyenin en uzun nehri?"};
        String [][] options = {
                                {"1. Almanya", "2. ABD", "3. Rusya", "4. Irak"},
                                {"1. 2000", "2. 1993", "3. 1923", "4. 1440"},
                                {"1. Dicle", "2. Fırat", "3. Kızılırmak", "4. Yeşilırmak"},
        };

        int[] answers = {4, 3, 2};
        int score =0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*************");
        System.out.println("Soru Programı");
        System.out.println("*************");

        for(int i = 0; i<questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);

            }
            System.out.println(" ");
            System.out.print("Cevabınızı Giriniz: ");
            guess = scanner.nextInt();
        
            if(guess == answers[i]){
                System.out.println("Doğru!");
                score++;
            }
            else{
                System.out.println("Yanlış!");
            }
        }

        System.out.print("Vermiş oldugunuz cevaplardan "+ score +" tanesini dogru yaptiniz toplam "+ questions.length+ " soru icerisinden");
        scanner.close();


    }
}