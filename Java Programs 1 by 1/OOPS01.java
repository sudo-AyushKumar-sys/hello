//Non-Parameterized Constructor
class Student{
    String name;
    int age;

    Student(){
        System.out.println("This is Non-Parameterized Constructor");
    }
}
public class OOPS01{
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Ayush";
        s1.age=22;

    }
}