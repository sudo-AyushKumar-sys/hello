class Bikes{
    String Color;
     String Name;
      int Year;
       int Milage;

        public void Honda(){
        System.out.println("Hero-Honda CD100SS is my Favourite Bike !");
        }
        public void printColors(){
        System.out.println(this.Color);
        }
        public void thisName(){
        System.out.println(this.Name);
        }

}

public class OOPS100{
    public static void main(String[] args) {
        Bikes Honda = new Bikes();
        Honda.Color = "Red";
        Honda.Milage =50;
        Honda.Year = 1999;
        Honda.Name = "Hero Honda CD100SS";

        Honda.Honda();
        Honda.printColors();
        Honda.thisName();
    }
}