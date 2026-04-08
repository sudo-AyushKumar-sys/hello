//Method Overloading
class Calculator{
    int num;//is instace variable
    
    public int add(int n1,int n2,int n3){ //Now we have a method called add and has = 3 parameters
        return n1+n2+n3;
    }
    public int add(int n1,int n2){ //Now we have another method with the same name called add has = 2 parameters
        return n1+n2;    
    }
    public double add(double n1,int n2){ ///Now we have another method with the same name called add has = 2 parameter
        return n1+n2; 
    }
    //Now we have different type of parameters(int,double)
    //And different number of parameters
    //And methods have the same name is Called Method Overloading


}
public class 25Method2 {
public static void main(String[] args){
    Calculator calc=new Calculator();
    int r1=calc.add(2, 2,7);
    System.out.println(r1);
    

    }    
}
