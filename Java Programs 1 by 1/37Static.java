//Static means - common for class
class Student{
    String name;
    static String schoolName;//schoolName is same for all Students
}

public class Static {
    public static void main(String[] args) {
        Student.schoolName="DPS";//When we make a static method we don't need to create a
        //new object to access
        Student student1 = new Student();
        student1.name="tony";
        System.out.println(student1.name);
        System.out.println(student1.schoolName);
    
    
    
    }
}
