class Calculator{ //class calculator
    public int add(int n1, int n2){ //method
        int r = n1+n2;
        //System.out.println("in add");
        return r;
    }
}

public class classobject{
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 4;



        //Object mera main class ke andar banta hai
        Calculator calc = new Calculator();
        //method call
        int result = calc.add(num1,num2);
        System.out.println(result);
    }
}