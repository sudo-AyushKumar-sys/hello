class stud{ //class
    String name;
    int age;

    public void printer(){ //method
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //constructor-constructs objects
    //3 types of constructor 3 ways we can create an object -1Non parameterized,
    // Properties of Constructor
    // 1.Constructor name and Class name Should be same
    // 2.Constructors Don't return anything
    // 3.Constructor Should call 1 time for 1 object(When an object is created )
    // STEP7: Non Parameterized Constructor-A constructor without parameters


    stud(){ //Non Parameterized Constructor
        System.out.println("Non-Parameterized constructor");
    }
    stud(String name,int age){
        this.name = name;
        this.age = age;
    }
}

public class OOPS0{
    public static void main(String[] args) {
         stud s1 =new stud();//constructor
        s1.name ="Ayush";
        s1.age = 24;
        s1.printer();
        stud s2 = new stud("Ayush", 26);
        //s2.name = "Ayush";
        // s2.age = 26;
        s2.printer();
    }
}