public class Car{

    String model; 
    int year;
    Engine engine;

    Car(String model, int year, String engineTyp){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineTyp);
    }

    void start(){
        this.engine.Startt();
    }
}