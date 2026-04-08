class calculus{
    int num = 5;

    public int maths(int n1, int n2){
        System.out.println(num);
        return n1+n2;

    }
}

public class Stack{
    public static void main(String[] args){
     int data = 10;
     calculus calc =new calculus();
     int result1 = calc.maths(2,2);
        System.out.println(result1);
    }
}