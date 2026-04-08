//Anonymous object in java
class A{
    public A(){
        System.out.println("Object created");
    }
    public void show(){
        System.out.println("I a Show");
    }
}
public class Anonymous {
    public static void main(String[] args){
        //Here a new object is created
       // A obj = new A();

        new A(); //Anonymous Object
        //Because this object don't have a name

        //We can call show using this object
        new A().show();

    }
}
