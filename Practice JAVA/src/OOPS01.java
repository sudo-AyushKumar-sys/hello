//Constructor Practice
class cars{
    String model;
    String color;

            public void Drive1(){
                System.out.println("Car1 Engile on");
            }
            public void Drive2(){
                System.out.println("Car2 Engile on");
            }
            public void Drive3(){
                System.out.println("Car2 Engile on");
            }
            public void thisColors(){
                System.out.println(this.color);
            }
            public void thisModels(){
                System.out.println(this.model);
            }

}

public class OOPS01{
    public static void main(String[] args) {

        cars Lamborgini = new cars();
        Lamborgini.model = "av2";
        Lamborgini.color = "white";

            Lamborgini.Drive1();

        cars Ferrari = new cars();
        Ferrari.model = "laf";
        Ferrari.color = "red";

            Ferrari.Drive2();

        cars BMW = new cars();
        BMW.model = "M5";
        BMW.color = "black";

            BMW.Drive3();

        BMW.thisColors();
        Ferrari.thisModels();




    }
}