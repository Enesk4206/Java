public class Fish implements Predator, Prey{


    @Override
    public void hunt(){
        System.out.println("*The Fish is hunting*");
    }

    @Override
    public void flee(){
        System.out.println("*The fish is running*");
    }
}