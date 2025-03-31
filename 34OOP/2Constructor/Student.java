public class  Student{
   
    String name = "Spongebob";
    int age ; 
    double gpa;
    boolean isEnrolled;

    //constractor metod name must be same like class name 

    Student(String name, int age, double gpa){          //Eğer ilgili nesneyi çağırırsan parametre belirterek 
    //o zaman o metod kendisini required olarak ayarlar. Artık hep o metoda dışarıdan parametre girmek zorunda kalınır
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true; 
    }

    void study(){
        System.out.println(this.name + " is studying");
    }

}