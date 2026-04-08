//While loop PART 1
class whileloop{
    public static void main(String[] args) {
        int i =1;
        while(i<=4){
            System.out.println("hi");
            i++;
            System.out.println(i);
        }
        //WHILE NESTED LOOP
        int a = 1;
        while(a<=4)
        {
            System.out.println("Hi" + a);
            int b = 1;
            while(b<=3){
                System.out.println("Hello" + b);
                b++;
            }
            a++;
        }
    }
}