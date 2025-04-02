public class Main{

    public static void main(String [] args){
        //toString ile nesneye bağlı olmadan tüm propları yazmamızı sağlar override etmemiz gerekir ama
        // bak yinede!
        Car car1 = new Car("Ford", "Mustang", 2022, "Black");
        Car car2 = new Car("Chevrolet", "Corvette", 2024, "Red");

        System.out.println(car1);
        System.out.println(car2);
    }
}