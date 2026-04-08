//Interface - It works on pure Abstraction
//pure Abstraction hides all the useless information
//only shows useful information
//We can define interface by writing interface keyword

interface Animals{ //A Interface class
        final int eyes =2;
        public  void walks();//abstract method Interface abstract methods cannot have a body
       // Animals(){ } Constructor is not allowed in interface
       // void eat(){ } Interface abstract methods cannot have a body

        }
class Horses implements Animals{ //We can only implements Interface not Extends
        public void walks(){
                System.out.println("Walks on 4-legs");
        }
}


public class Interface{
   public static void main(String[] args) {

           Horses ghoda = new Horses();
           ghoda.walks();
        }
}