// final keyword - variable, method, class makes it constant
 class Z{ //final class
            public final void show(){ //final method
                System.out.println("In Calc Show");
                }
            public void add(int a,int b){
                System.out.println(a+b);
            }


}



public class Final{
    public static void main(String args[]){
        final int num = 9; //final variable
        System.out.println("final variable "+num);

        Z obj = new Z();
        obj.show();
        obj.add(4,5);



    }
}