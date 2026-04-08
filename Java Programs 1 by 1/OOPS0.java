
//STEP5: We will create a new Class 
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //STEP6: WE WILL KNOW CONSTRUCTOR !!
    /*  A constructor constructs it constructs Objects 
     * 3 types of constructor 3 ways we can create an object
     * Properties of Constructor
     * 1.Constructor name and Class name Should be same
     * 2.Constructors Don't return anything
     * 3.Constructor Should call 1 time for 1 object(When an object is created )
     * STEP7: Non Parameterized Constructor
     * 
    */
    // Student(){ //STEP7: (1st Type) Non parameterized Constructor(it has no parameters)
    //     System.out.println("Constructor Called");
    //    // prints-"Constructor Called"

    // }
    //STEP8:Parameterized Constructor
    Student(String name, int age){
            this.name=name;//this.name=Object ka name & name= parameter's name  
            this.age=age;
    }


}

public class OOPS0 { 
    
    public static void main(String[] args) {
        // /*STEP7:*/    Student s1= new Student(); /*Here Student() is a constructor 
        //                             Whenever this object(new Student) is created 
        //                             constructor Student() is called. prints-"Constructor Called"*/
        // // s1.name="Ayush";
        // // s1.age=22;

    /*STEP5 We will print object s1 information*/  //  s1.printInfo();
        
    //STEP8:Parameterized Constructor
    Student s1= new Student("Ayush",22);
    s1.printInfo();
    }
}
