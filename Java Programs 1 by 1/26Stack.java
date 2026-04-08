//Method Overloading
class Calculator{
    int num=5;//is instace variable
    
   
    public int add(int n1,int n2){ //Now we have another method with the same name called add has = 2 parameters
        System.out.println(num);
        return n1+n2;    
    }
   
    
}
public class Stack {
public static void main(String[] args){

    int data=10;
    Calculator calc=new Calculator();
    int r1=calc.add(2, 2);
    System.out.println(r1);
    

    }    
}
