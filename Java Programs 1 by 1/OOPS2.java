class Bike{
    String color;
    String name;
    int year;
    int milage;
    public void Honda(){
        System.out.println("Hero Honda CD100SS is my Favourite Bike !");
    }
    public void printColor(){
        System.out.println(this.color);
        
    }
    public void thisName(){
        System.out.println(this.name);
    }
}
public class OOPS2{
    public static void main(String[] args){
        Bike Honda=new Bike();
        Honda.color="Red";
        Honda.name="Hero Honda CD100SS";
        Honda.year=1999;
        Honda.milage=50;

        Honda.Honda();
        //Honda.printColor();
        Honda.thisName();        

    }
}