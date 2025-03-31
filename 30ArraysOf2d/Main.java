public class Main{

    public static void main(String[] args){
        //iç içe array tanımıdır
        String[] fruits = {"Strawberry", "Pineapple", "Apple", "Orange"};
        String[] vegatables = {"Potato", "Onion", "Carrot"};
        String[] meats = {"beef", "chicken","fish"};

        String[][] groceries = {fruits, vegatables, meats};

        // for(String[] foods : groceries){
        //     System.out.println(foods); // Böyle yazarsan alan adresini verir
        // }

        ///*groceries içerisindeki tüm verileri görmek için
        ///
        // for(String[] foods : groceries){
        //     for(String food : foods){
        //         System.out.print(food+ " ");
        //     }
        // }

        ///* belirli bir veriyi getirmek için;
        // System.out.println(groceries[0][0]); //Strawberry
        // System.out.println(groceries[1][0]); //Potato
        // System.out.println(groceries[2][2]); //fish

        ///* ekstradan eğe istersek ilgili indexte atama ve değiştirme yapabiliriz
        ///
        groceries[0][0] = "Pine";
        System.out.println(groceries[0][0]); // Strawberry --> Pine


    }   
}