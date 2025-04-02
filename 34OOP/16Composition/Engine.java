public class Engine{
    String type;

    Engine(String type){
        this.type = type;
    }

    void Startt(){
        System.out.println("You start the "+ this.type+ " engine");
    }
}