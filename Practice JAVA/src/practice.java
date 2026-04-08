class bulepen{
    String type;
    String color;

    public void write(){
        System.out.println("Writing");
    }
    public void solve(){
        System.out.println("Solving");
    }
    public void pencilColor(){
        System.out.println(this.type);
        System.out.println(this.color);
    }
}

public class practice{
    public static void main(String[] args) {

        bulepen obj = new bulepen();
        obj.write();
        obj.solve();

        obj.type = "gel";
        obj.color = "blue";

        obj.pencilColor();




    }
}