public class Main{

    public static void main(String [] args){
        // parent classı referans alır yapıcı ve diğer metodları overriding eder
        // 

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Tom", "Riddle", 13);
        Employee employee = new Employee("Sam","Linz",5500);

        person.showName();
        student.showGPA();
        employee.showSalary();
    }
}