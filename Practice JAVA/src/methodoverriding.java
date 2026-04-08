class A{
        public void Show(){
        System.out.println("In A Show");
         }
         public void Config(){
             System.out.println("In A Config");
         }
}
class B extends A{
    public boolean marks;//In B i want to print "In a config" of A but not "In A Show" i want "In B Show" - This is Method Overriding
    public void Show(){
        System.out.println("In B show");
    }
}


public class methodoverriding{
    public static void main(String[] args) {
       // A obj = new A(); - In A Show In A Config
        B obj = new B(); //Method Overriding
        obj.Show();
        obj.Config();
    }
}