public class Main{

    public static void main(String [] args){
        // değerleri yada metodları ilgili sınıfa ekler genellikle utility veya paylaşılacak metodlar için kullanılır.
        // nesne oluşturmadan direkt class ismiyle çağrılırlar
        // ortak veri ve metodlar için uygundur
        // en önemlisi bellekte tek bir kopya oluşturulur

        Friend friend1 = new Friend("Hikmet");
        Friend friend2 = new Friend("Hasan");
        Friend friend3 = new Friend("Kerim");
        Friend friend4 = new Friend("Jale");
        Friend friend5 = new Friend("Selami");

        //static değeri direk class ismi ile çağırabilirim
        // System.out.println(Friend.numOfFriends);

        Friend.showFriends();


        ///* Bazı yapılar otomatik statictir mesela math classı
    ///
    
    // Math math = new Math(); (BUNU YAPMAK MESELA GEREKSİZ)

    }

}