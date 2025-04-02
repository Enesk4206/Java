public class Main{

    public static void main(String [] args){

        //POLY = MANY,
        //MORPH = SHAPE,
        // nesneler diğer nesneleri tanımlayabilir, süpersınıflara dönebilir

        Boat boat = new Boat();
        Car car = new Car();
        Bike bike = new Bike();

        // Car[] cars = {boat, car, bike};   //burdaki boat ve bike dan dolayı cars hiçbir zaman geçerli olmayacak
        
        // Vehicle[] vehicles = {boat, car, bike}; //parentı saydı

        // for(Vehicle vehicle : vehicles){
        //     vehicle.go();
        // }
        /// Vehicle normal parent class dı şimdide Vehicle1 diye bir interface kurucam kullanmak için child classların metodları public olmak zorunda
        /// bir de extends ile değil implements ile bağlanma 
        //

        Vehicle1[] vehicles = {boat, car, bike};
        for(Vehicle1 v : vehicles){
            v.go();
        }
    }
}