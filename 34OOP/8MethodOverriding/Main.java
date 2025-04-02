public class Main{

    public static void main(String [] args){
        //tanımlı olan parent class daki metodların ezme işlemini yapabilir yerinede getirebilir
        // parent class = animal, child class = fish --> burda move metodunu override ediyor 
        // ÖNEMLİ!! override edilecek metod parent class daki ezmek istenen metod ile aynı olmak zorudadır     

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }    
}