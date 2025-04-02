public class Main{

    public static void main(String [] args){
        //Inheritance => bir tane sınıf öznitellikleri ve metodları kalıtım alıp diğer sınıflarda da kullanır.
        // Child < Paren ilişkisi

        // Grandparent = Organism,  Parent class = Animal, Children classes = Dog&Cat 

        Dog dog = new Dog();
        Cat cat = new Cat();

        // System.out.println(dog.isAlive);
        // System.out.println(cat.isAlive);

        // dog.eat();
        // cat.eat();

        System.out.println("Dog has "+ dog.lives);
        System.out.println("Cat has "+ cat.lives);

        dog.speak();
        cat.speak();

        // Inheritance from Dog->Animal->Organism
        System.out.println(dog.isAlive);
    }
}