public class Main{

    public static void main(String [] args){

        // Car car1 = new Car("e200" ,"white");
        // Car car2 = new Car("420i", "blue");
        // Car car3 = new Car("Corolla", "black");

        // Car[] cars = {car1,car2, car3};
        
        ///* 1.yöntem
        ///
        // for(int i= 0; i<cars.length;i++){

        //     cars[i].drive();
        // }

        ///* 2.yöntem
        // for(Car car : cars){
        //     car.drive();
        // }


        Car[] cars = {
            new Car("Focus","White"),
            new Car("Clio","White"),
            new Car("Astra", "Black"),
        };


        for(Car car : cars){
            car.color= "Red";
        }
        for(Car car : cars){
            car.drive();
        }
    }
}