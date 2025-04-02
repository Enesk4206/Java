public class Main{
    public static void main(String [] args){
        // Sınıflara ve metodlara implement edilir
        // Daha çok implementleme işlemlerini saklamak için kullanılır ve sadece gerekli olan özellikler gösterilir
        // hangisinin soyut hangisinin somut olduğu methodları içerir
        // yinede bak

        // Shape shape = new Shape();  //böyle kullanamayız çünkü soyut bir sınıf (newlen miyor)
        // mesela parent class = shape, child class = Circle ---> eğer (abstrackt method tanımlarsan Shape classına 
        // o zaman mecburen Circle da tanımlamam gerekir fakat somutyani concrete de öyle bir dert yok)

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(3,4);
        Rectangle rectangle = new Rectangle(3,4 );

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}