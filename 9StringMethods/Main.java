public class Main{
    public static void main(String[] args){

        ////* String yapısında kullanılan fonksiyonları göreceğiz
        
        //*length: karakter sayısını verir

        // String name = "Ahmet";
        // int lengthOfName = name.length();
        // System.out.println(lengthOfName);


        //* charAt: parametre olarak indis sayısı verilir ve karşılığında belirli indisteki String değeri döndürülür
        //* indexOf: parametre olarak indis değil string karakteri verilir ki index bulunsun charAt' ın tersi

        // String name1 = "Ahmet";
        // char letter = name1.charAt(2); //m
        // int index = name1.indexOf("m"); //2
        // System.out.println(letter);
        // System.out.println(index);

        //*lastIndexof: parametre olarak verilen karakterin indisini bulur AMA EN SOLDAN EN SONDAKİ DEĞERİ BAZ ALARAK 

        // String name = "Foreigner";
        // int lastIndex = name.lastIndexOf("e"); //7
        // System.err.println(lastIndex);


        //*Upercase-lowercase : karakterleri büyütüp küçültür

        // String name = "Hello World";
        // String upper = name.toUpperCase();
        // String lower = name.toLowerCase();

        // System.out.println(upper + "\n" + lower);


        //* trim: Başta ve sonda olan gereksiz boşlukları siler

        // String name = "      Serdar Aziz Başkan       ";
        // name = name.trim();
        // System.out.print(name); 

        //*replace: parametreye verilen ilk değer ile belirlenen string değerini 
        //ikinci parameter değerini string dizisi içerisinde değistirir örn ahmet replace(o,a) = ohmet

        String name = "Ahmet";
        name = name.replace("A", "C"); //Chmet
        System.out.println(name);



        //*isEmpty: eğerki geçerli string boş ise -->true değil ise yani değer var ise false döner

        String male = "";
        System.out.println(male.isEmpty()); // true


        //* contains: belirli string değeri içerisinde belirli karakteri var olup olmadığına bakar

        String x = "AhmetSanGezerIstanbul";
        System.out.println(x.contains("S")); /// true

        if(x.contains(" ")){
            System.out.println("Your string contains space");
        }else{
            System.out.println("Your string doesnt contains space");
        }



         //*equals: eşitlik var mı diye kontrolü sağlar

         String myName = "Enes";
         String password = "Enes";

         if(myName.equals(password)){
            System.out.println("Your name cant be password");
         }else{
            System.out.println("Hello "+myName+ "!");
         }
        
    }
}