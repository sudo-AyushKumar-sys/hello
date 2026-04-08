//Inner Class
class A1{ //So Class A contains 1.Variable 2.Method, 3.A Inner Class
    int age;
    public void show(){
        System.out.println("In A Show");
    }
    class B1{ //Inner Class- Class ke ander Class
        public void Config(){
            System.out.println("In B Config");
        }
    }
}

public class innerclass{
    public static void main(String[] args) {
        A1 obj0 = new A1();
        obj0.show();
        //Q.How do we call config
        A1.B1 obj1 = obj0.new B1();
        obj1.Config();

    }
}