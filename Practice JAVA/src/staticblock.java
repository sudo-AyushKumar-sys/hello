class laptop{
    String brand;
    int price;
    static String name;


    public laptop(){ //constructor
        brand = " ";
        price = 200;
        System.out.println("Constructor");
        //name = "lapy";
            }



    public void bigShow(){
        System.out.println(brand + " " + price + " " + name);
    }

    static { //a static block-called only once w.r.t many many objects
        name ="lapy";
        System.out.println("Static block");
    }
}

public class staticblock{
    public static void main(String[] args){
        laptop l1 = new laptop();
        l1.brand = "hp";
        l1.price = 40000;
        l1.name = "Coding laptop";

        l1.bigShow();

    }
}