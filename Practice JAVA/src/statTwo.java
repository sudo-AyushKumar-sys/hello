//Static variable Part 2
class telePhone{
    String brand;
    int price;
    static String name;

    public void Showroom(){//method
        System.out.println(brand + " " + price + " " + name);
                          }

}

public class statTwo{
    public static void main(String[] args) {
        telePhone t1 = new telePhone(); //objects
        t1.brand = "nokia";
        t1.price = 1500;
        t1.name = "dumb phone";

        telePhone t2 = new telePhone();
        t2.brand = "tata";
        t2.price = 1200;
        t2.name = "dumb phone";

        telePhone t3 = new telePhone();
        t3.brand = "motorola";
        t3.price = 1999;
        t3.name = "dumb phone";

        t1.name ="Smart phone";

        t1.Showroom();
        t2.Showroom();
        t3.Showroom();

    }
}