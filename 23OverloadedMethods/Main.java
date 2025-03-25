public class Main{


    public static void main(String [] args){

        ///* overloaded methods: metod aynı ismi paylaşır fakat farklı parametre ile  ->>> signature = name + parameters
        /// aşır yükleme ile aynı isimdeki metodla çağırma yapabiliriz ama farklı parametrelerlede kullanılabilir.
        
        System.out.println(add(22,33,44, 55));

        String pizza = "Flat Bread";
        String cheeseyz = "asdasdPizaaMhhm";
        System.out.println(bakePizza(pizza, cheeseyz));
       
        
    }

    static double add(double a, double b){
            return a+b;
    }
    static double add (double a, double b, double c ){
        return a+ b+c;
    }
    static double add (double a, double b, double c, double d){
        return a+ b+ c+ d; 
    }

    static String bakePizza(String bread){
        return bread+ " " + "Pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread + " " + cheese + " Pizza";  
    }


        
}