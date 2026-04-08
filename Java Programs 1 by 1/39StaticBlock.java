class Computer{
    String Brand;
    int Price;
    static String name;//Static variable

    //STEP1:Create a static block
    // Static{
    //     name="pc";
    // }

    public Computer(){//Using constructor
        Brand="Apple";
        Price= 200;
       // name="pc";//WE can initialize the variable name in Constructor

    }

    public void Show(){
        System.out.println(Brand+ " : "+ Price +" : "+name);
    }

}

public class StaticBlock {
    public static void main(String[] args){
        
        Computer pc1=new Computer();
            pc1.Brand="Apple";
            pc1.Price=70000;
            pc1.name="Laptop";

        
    }
}
