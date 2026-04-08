//static method
class Computers{ //class
    String brand; // variables of class
    int price;
    static String name;

    public void show(){ //A method
        System.out.println(brand + " " + price + " " + name);
                      }
    public static void show1(Computers pc){ //A static method
        System.out.println();
        System.out.println(pc.brand + " " + pc.price + " " + pc.name);
                              }
}

public class staticMethod{
    public static void main(String[] args){

        Computers pc1 = new Computers();//object
        pc1.brand = "abc";
        pc1.price=70000;
        pc1.name="Laptop";

        Computers pc2 = new Computers();//object
        pc2.brand = "def";
        pc2.price=76000;
        pc2.name="Laptop";

        Computers pc3 = new Computers();//object
        pc3.brand = "ghi";
        pc3.price=78000;
        pc3.name="Laptop";

        //methods
        pc1.show();
        pc2.show();
        pc3.show();

        //static method
        Computers.show1(pc1);



    }
}