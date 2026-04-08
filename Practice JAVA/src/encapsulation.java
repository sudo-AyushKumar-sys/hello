//Encapsulation- is  the medicine capsule the outer layer protects the medicine inside and controls how it released
//Encapsulation means bundling the data variables and methods that works on sing;e class while hiding the internal details from outside world

class nomo{ //class
    //private variable
    private int age=12; //thisvariable access only in this Home class
    private String name = "xyz";
    //the only way they can access it using methods

    //provide public methods like get(), set() to access or change the data
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }

}
class animal{
    private int age ; //What if we want to set the name after
    private String name;

    public int getage(){
        return age;
    }
    //STEP5:We have to create a new Method
    public void setage(int age){
        this.age = age;
    }
    public String getname(){
        return name;
    }
    //STEP5:We have to create a new Method
    public void setname(String name){
        this.name = name;
    }
}


public class encapsulation{
    public static void main(String[] args) {

        nomo obj1 = new nomo(); //object
        System.out.println(" homo " + obj1.getage() + " " + obj1.getname());//here you have to write the method name not variable

        animal obj2 =new animal(); //object
        obj2.setage(24);
        obj2.setname("Tiger");

        System.out.println("animal " + obj2.getage() + " " + obj2.getname());
    }
}