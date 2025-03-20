import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        /// Math fonksiyonları double ile çalışır unutma

        // System.out.println(Math.PI);
        // System.out.println(Math.E);


        // double result;

        // result = Math.pow(3,5);  --> ilk sayı taban ikinci sayı üs olup üssünü alır
        // result = Math.abs(-3); --> negativ sayıyı pozitif yapar
        // result = Math.sqrt(9); --> sayının kökünü alır 

        // result = Math.round(3.50); --> sayının tam değerini alır 3.22 == 3 || 3.66 == 4 || 3.50 == 4
        // result = math.ceil(3.14); --> hertürlü bir üste yuvarlar 4 
        // result = Math.floor(3.99);  --> hertürlü bir alta yuvarlar 3

        // result = Math.max(20,40); --> max değeri verir
        // System.out.println(result);
        // result = Math.min(20,40); --> min değeri verir
        // System.out.println(result);


        /// Hipotenüs Bulma a2 + b2 = c2 ==> c = a+b karekökü
        ///
        
        double hipo;
        double a;
        double b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write 1st edge");
        a = scanner.nextInt();
        System.out.println("Please write 2nd edge: ");
        b = scanner.nextInt();

        hipo = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hipotenüs is: " + hipo);

        scanner.close();





    }
}