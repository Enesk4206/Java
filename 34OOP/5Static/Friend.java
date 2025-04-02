public class Friend{
    
    String name;
    static int numOfFriends;


    Friend(String name){
         this.name = name;
         numOfFriends++;
    }

    static void showFriends(){
        //numoffriends zaten static olduğu için ekstradan this.numoffrinds diye tanımlamam gerekmiyor
        System.out.println("You have total "+ numOfFriends+ " friends");
    }


    ///* Bazı yapılar otomatik statictir mesela math classı
    ///
    
    // Math math = new Math(); (BUNU YAPMAK MESELA GEREKSİZ)


}