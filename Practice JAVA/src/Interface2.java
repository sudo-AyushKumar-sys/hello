interface ab{
    final int age =4;
    String area = "Mumbai";

    void show();
    void config();
}

class  bc implements ab{
    public void show(){
        System.out.println("In A show");
    }
    public void config(){
        System.out.println("In B Config");
    }
}
public class Interface2{
    public static void main(String[] args) {
        ab obj = new bc();
        obj.show();
        obj.config();
        System.out.println(ab.area + " " + ab.age);



    }
}