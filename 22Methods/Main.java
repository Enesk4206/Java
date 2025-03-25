public class Main{

    public static void main(String [] args){
    
        ///* Methodlar çağırdığımızda gelen yapılardır fonksiyon mantığı
        ///
        String name = "Ahmetxfsdf";
        int age = 10;
        int number = 3;

       // callName(name, age);
        double value = square(number);
        System.out.println(value);

        System.out.println(cube(number));

        String firstName = "Sırrı";
        String lastName = "Sensoroglu";
        String valueOfName =  getFullName(firstName, lastName);
        System.out.println(valueOfName);

        System.out.println(ageCheck(age));

    }
    static  void callName(String username, int userage){
        System.out.println("Tebrikler Okulumuzda Eğitim almaya hak kazandınız");
        System.out.println("Sevgili "+username+ " Lütfen bizi arayın");
        System.out.println(userage+". Yaşınızı içtenlikle kutlarız...");
        System.out.println(username+" okul gününde bulunmadı!");
    }

    static double square(int a){
        return a*a;
    }

    static double cube(double value){
        return  value *value * value;
    }


    //getfullname
    static String getFullName(String first, String last){
        return first + " " + last;
    }


    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}