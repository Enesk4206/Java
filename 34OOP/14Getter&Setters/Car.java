public class Car{

    private String model; // private final String model  (eğer final kullanırsan sadece bir kere değer atanır setlemeye izin vermez)
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getColor(){
        return this.color;
    }
    String getModel(){
        return this.model;
    }
    String getPrice(){
        return "$" + this.price;
    }


    void setColor(String color){
        this.color = color;
    }
    void setModel(String model){
        this.model = model;
    }
    void setPrice(int price){
         this.price = price;
    }

}