class ternary{
    public static void main(String[] args) {
        int num1 =4;
        int num2 =0;

        /*if (num1 % 2 ==0) {
            num2 = 10;
        }
        else{
            num2 = 20;
            } */

        //Ternary Operator = ? :
        //variable = (condition) ? valueIfTrue : valueIfFalse;
        num2 = num1 %2 == 0 ? 10 : 20;
        System.out.println(num2);

//   /////////////////////////       ANOTHER CODE         ////////////////////////////////

        //variable = condition ? ValueIfTrue : ValueIfFalse;
        int x = 8;
        int y = 7;
        int z = 9;

        int greatest = (x>y && x>z) ? x : y>z ?y : z;
        System.out.println(greatest);

        /*int x = 10;
        int y = 7;
        int z = 9;

        if(x>y && x>z){
            System.out.println(x);
        }

        else if(y>x && y>z){
            System.out.println(y);
        }

        else
            System.out.println(z); */

    }
}