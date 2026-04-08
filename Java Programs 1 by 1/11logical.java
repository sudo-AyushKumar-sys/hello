public class logical{
    public static void main(String[] args){
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean finalVal = x>y && a>b;
        System.out.println(finalVal);

        boolean finala = a>b;
        System.out.println(!finala);// false -> true
    }
}