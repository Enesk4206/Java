public class Main{

    public static void main(String [] args){

        /// printf belirli formatta da değişkenleri yazmamızı sağlar
        ///
        ///
        
        // String name = "Enes";
        // char firstLetter = 'A';
        // int age = 25;
        // double height = 60.45;
        // boolean isEmployed = false;


        // string için %s,
        // int için %d,
        // char için %c, 
        // double için %f, 
        // boolean için %b

        // System.out.printf("Hello %s \n", name);
        // System.out.printf("The Character is %c \n",firstLetter);
        // System.out.printf("Your age is %d years old \n",age);
        // System.out.printf("Your height is %f it is so little \n",height);
        // System.out.printf("Are you employed %b \n",isEmployed);

        // System.out.printf("%s is %d years old his height is %f",name, age, height );
        



        //*float ve double değerleri belirleme 'f' önüne getirilen sayılar küsürlü sayıların virgülden sonraki basamağını
        //default olarak double 6 basamaklıdır -> %f === 99,990000 ama %1f === %.1f 99,9 (NOKTA KOYMAYI UNUTMA)
        //*aynı şekilde %.2f yaparsam 99.99 olur

        // --> (  operatörü de negativ değeri pozitive çevirir 

        // double price1 = 99.99;
        // double price2 = 123.12;
        // double price3 = -33.33;


        // System.out.printf("%.2f \n", price1);
        // System.out.printf("%.2f \n", price2);
        // System.out.printf("%(2f \n", price3);
      

        //*paddin ekleme işlemi yapar int değerlerde %d normalde ==1 ise oland değere %03d ===001 yapar
        //yine aynı şekilde %d değerini %3d yaparsam sıfırları eklemez ama mesafeyi ekler

        int id1 = 1;
        int id2 = 23;
        int id3 = 404;
        int id4 = 4444;


        System.out.printf("%03d \n", id1);
        System.out.printf("%03d \n", id2);
        System.out.printf("%03d \n", id3);
        System.out.printf("%03d \n", id4);

    }
}