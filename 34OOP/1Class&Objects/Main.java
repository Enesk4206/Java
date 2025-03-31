
import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String [] args){
        

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //** dışardan eklediğim sınıf yenilenebilir ve attributelarıyla(öznitelikleriyle) çağrılabilir hatta */
        //** */ Object(Nesne) ->>>
        //+ herhangi bir varlık(nesne) verileri özellikleriyle tutabilir
        //+ metodlarla çalışabilir
        //+ referanslı veri tipidir


        // Car car = new Car();

        // System.out.println(car.name);
        // System.out.println(car.model);
        // System.out.println(car.price);
        // System.out.println(car.year);
        // System.out.println("********");


        // System.out.println(car.isRunning);
        // car.start();
        // System.out.println(car.isRunning);
        // car.stop();
        // System.out.println(car.isRunning);

        // System.out.println("********");
        // car.drive();
        // car.brake();

        ///*** */
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.model);
        System.out.println(car2.model);

        
        
    }
}