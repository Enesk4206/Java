public class Main{

    public static void main(String [] args){

        ///* LOCAL > CLASS (eğer ki aynı isimde değişkeni tanımlarsam class gibi davranır ve öncelik tabikide localde olur bu local 
        ///* hem main içerisinde bulunandır hemde fonksiyon olarak çalıştırılan metod olandır)

        //variable nerde kullanılır 

        // int x = 1;  //--->LOCAL

        System.out.println(x);
    }

    static void doSomething(){
        // int x = 2; //---->LOCAL
        // System.out.println(x);

    }

    static int x = 3; //---->CLASS 
}