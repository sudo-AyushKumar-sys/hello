//Parameterized Constructor
class Student{
    String name;
    int age;
    public void infoStudent(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
}

public class OOPS03{
    public static void main(String[] args){
        Student s1=new Student("Ayush",22);
            s1.infoStudent();
        

    }
}