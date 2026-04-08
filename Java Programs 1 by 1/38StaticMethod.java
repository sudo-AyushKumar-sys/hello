//Static Method In JAVA
class Computer{
    String Brand;
    int Price;
   static String name;

    public void Show(){// Show is a instance method
        System.out.println(Brand+ " : "+ Price +" : "+name);
    }
    //STEP1: Let's Create a Static method
     public static void Show1(Computer pc){
        System.out.println(pc.Brand+ " : "+ pc.Price +" : "+name);
     }
      /*//The main difference between Static method and 
      Instance method is for calling Instance method in main 
      function we've to create an Object
      But, for calling static method we don't need an Object */
}
public class StaticMethod {
    public static void main(String[] args ){
        Computer pc1=new Computer();
        pc1.Brand="Apple";
        pc1.Price=70000;
        pc1.name="Laptop";

        Computer pc2=new Computer();
        pc2.Brand="DELL";
        pc2.Price=50000;
        pc2.name="Laptop";

        Computer pc3=new Computer();
        pc3.Brand="HP";
        pc3.Price=40000;
        pc3.name="Laptop";

        pc1.Show();
        pc2.Show();
        pc3.Show();

        Computer.Show1(pc1);

    }
}
