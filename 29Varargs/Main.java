public class Main{

    public static void main(String[] args){
        // varargs method allow with flexible methods dont need more overloadmethods

        System.out.println(add(2,300,199,2000));
        // average(33,4);
        average(32,33,44);

       
    }

    ///* Aşağıdakilerine gerek duymadan

    // public int add(int a, int b){
    //     return a+b;
    // }
    // public int add(int a, int b, int c){
    //     return a+b+c;
    // }
    // public int add(int a, int b, int c, int d){
    //     return a+b+c+d;
    // }

    ///* Bunların yerine varargs methodları kullanıyoruz
    ///
    // static void add(int... numbers){
    //     System.out.print(numbers); // Böyle yazarsam bana hafızadaki adresini verecek
    // }

    static int add(int... numbers){
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
    static void average(int... numbers){
        double sum =0;
        double average=0;

        if(numbers.length == 0){
            System.out.print(0);
        }
        for(int number : numbers){
            
            sum +=number;
        }
        average = sum/ numbers.length;
        System.out.print(average);
    }
    

}