//Static Variable
class Mobile{
    String Brand;
    int price;
    static String name;//STEP1: When we use static variable
        public void Showroom(){
            System.out.println(Brand+ " : "+price+" : "+name);
        }
}
public class StaticVar {
    public static void main(String[] args){
        Mobile p1=new Mobile();
        p1.Brand="Samsung";
        p1.price=20000;
        p1.name="SmartPhone";

        Mobile p2=new Mobile();
        p2.Brand="VIVO";
        p2.price=25000;
        p2.name="SmartPhone";

        Mobile p3=new Mobile();
        p3.Brand="Moto";
        p3.price=22000;
        p3.name="SmartPhone";

        p1.name="Phone";//STEP2:And place the new value 
                        //it will affect every object name 
        //Static Variable is Shared by every objects
        //And Changes every object's name at once that's why
        //We use Static Variable

        p1.Showroom();
        p2.Showroom();
        p3.Showroom();
        
    }
}
