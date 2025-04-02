public class Main{

    public static void main(String [] args){
         
         // Composition: nesnelerin ilişkilerinin parçası olurlar mesela makine arabanın bir parçası
         // küçük projelerede komplex projelerede uygulanır


         Car car = new Car("Passat",2022, "V43.33");

         System.out.println(car.model);
         System.out.println(car.year);
        //  System.out.println(car.engine); // bu haliyle verinin adresini verir sadece 
         System.out.println(car.engine.type); // olması gereken bu
         
         car.start();
    }
}