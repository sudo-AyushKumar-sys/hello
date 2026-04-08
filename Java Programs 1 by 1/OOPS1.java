class Car{
    String color;
    String model;
    
        public void drive1(){
                System.out.println("Car1 Engine On");
        }
        public void drive2(){
            System.out.println("Car2 Engine On");
        }
        public void drive3(){
            System.out.println("Car3 Engine On");
        }
        public void thisColor(){
            System.out.println(this.color);
        }
        public void thisModel(){
            System.out.println(this.model);
        }
    
}

public class OOPS1 {
    public static void main(String[] args) {
        Car Lamborgini = new Car();
        Lamborgini.color="White";
        Lamborgini.model="AV1";

        Lamborgini.drive1();

        Car Ferrari = new Car();
        Ferrari.color="Red";
        Ferrari.model="LaF";

        Car BMW = new Car();
        BMW.color="Black";
        BMW.model="M5";

        Ferrari.drive2();
        
        BMW.drive3();
        
        Lamborgini.thisColor();
        Ferrari.thisColor();
        BMW.thisColor();

        Lamborgini.thisModel();

    }


    
}
