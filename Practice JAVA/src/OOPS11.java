//Non-parameterized Constructor
class Studs{
    String name;
    int age;

    Studs(){
        System.out.println("Non-parameterized Constructor");
    }
}

public class OOPS11{
    public static void main(String[] args) {
        Studs s1 = new Studs();
        s1.name = "Ayush";
        s1.age=24;
        System.out.println(s1.name + " " + s1.age);


    }
}