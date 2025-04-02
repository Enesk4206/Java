public class Main{

    public static void main(String [] args){

        //Interface: abstrackt metodları planlı bir şekilde uygulamak için eklenir mecbur eklenmeli çoklu kalıtıma izin verilir
        
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();

    }
}