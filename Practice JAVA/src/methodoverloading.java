class Phone{

    public int a(int n1, int n2, int n3){
        return n1+n2+n3;
    }
   public int a(int n1, int n2){
        return n1+n2;
    }
    public double a(double n1, double n2){
        return n1+n2;
    }
}


public class methodoverloading{
    public static void main(String[] args) {
        Phone app = new Phone();
        int result = app.a(2,2,4);
        System.out.println(result);
    }
}