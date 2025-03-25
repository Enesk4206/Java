
import java.util.Scanner;





public class Main {

    public static void main(String [] args){
        //arrayler = veri topluluğunun olduğu aynı veri tipindeki veri dizinleri hafızada birden fazla veri tutulur

        // String fruit = "apple"; //String
        // String[] fruits = {"apple", "banana", "orange", "watermelon", "kiwi", "pear"}; //Arrays
        // // System.out.println(fruits[0]);

        // fruits[0] = "strawberry";  // belirli indisteki meyveyi değiştirmek
        // int numOfFruits  = fruits.length;   //array eleman sayısını öğrenmek

        ///* Alt daki 2 for da aynı işi görüyor
        // for(int i = 0; i < fruit.length(); i++){
        //     System.out.print(fruits[i]+ " ");
        // }   

        // for(String fruita: fruits){
        //     System.out.println(fruita);
        // }

      

        // Arrays.sort(fruits);        //Sıralama yapmamızı sağlar(alfabetik)
        // Arrays.fill(fruits, "at");  //array içerisindeki tüm veriyi parametredeki veriyle değiştirir

        //   for(String fruitx : fruits){
        //     System.out.println(fruitx);
        // }   



        //INPUT USER INTO ARRAY NEW DATA APP

        Scanner scanner = new Scanner(System.in);

        // String[] foods = new String[4];     //arrayi sınrlandırma max 4 tane al
        String[] foods= {};
        int size;
        
        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine(); // nextint den sonra boş satırı temizler

        foods = new String[size];


        for(int i = 0; i < foods.length; i++ ){
            System.out.println("Enter a food: ");
            foods[i]  = scanner.nextLine();

        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();
        

        


        
    }
}