class pencil{//class
    String type;
    String color;


         public void write(){
             System.out.println("Writing");
            }
         public void solve(){
             System.out.println("Solving");
         }
         public void printColor(){
             System.out.println(this.color);
         }
}

public class OOPS{
    public static void main(String[] args) {

        pencil ballpen = new pencil();
        ballpen.color = "blue";
        ballpen.type = "gel";

        pencil gelpen = new pencil();
        gelpen.color = "black";
        gelpen.type = "gel";

        ballpen.printColor();
        ballpen.write();
        gelpen.write();
        gelpen.printColor();
        gelpen.solve();
        ballpen.solve();

    }
}