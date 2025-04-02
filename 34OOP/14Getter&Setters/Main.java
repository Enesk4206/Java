public class Main{

    public static void main(String[] args){
        
        // getter ve setter'lar nesnenin verisini tutarlar ve değiştirmeye imkan sağlarlar
        // getter = o alanı okunabilir hale getir
        // setter = o alanı üzerine yazılabilir hale getir

        Car car = new Car("Fiesta", "Gray", 750000);
        
        // car.model = "Focus"; // private hale getirdiğimiz için artık erişim yok

        car.setModel("Charger");
        car.setPrice(4000000);
        System.out.println(car.getColor()+ " " +car.getModel()+ " "+ car.getPrice());
    }
}