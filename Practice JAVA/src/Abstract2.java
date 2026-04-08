//Abstraction means to Show important things to user  first and hide non imo=portant things
abstract class Animal{//Now we don't need class Animal every time when need to create horse or chiken
    public abstract void walk();//so we make it abstract- class, methods
    public void eat(){//We can make normal methods under abstract class
        System.out.println("Eats");
    }
    Animal(){////We can make constructor under abstract class
        System.out.println("You are creating a new animal");
    }

}
class Horse extends Animal{
    public void walk(){
        System.out.println("4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("2 legs");

    }
}

public class Abstract2 {
    public static void main(String[] args) {
        Horse ghoda = new Horse();
        //   ghoda.walk();
        //Animal janwar = new Animal();
        //   ghoda.eat();



    }
}
