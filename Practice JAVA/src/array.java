public class array{
    public static void main(String[] args){
        int nums[]={1,2,3,4};

        System.out.println("nums op - "+ nums[3]);

        int num1[] = {3, 7, 2, 4};
        num1[0] = 7;
        for(int j = 0; j < 4; j++) {
            System.out.println("num1 op - " + num1[j]);
        }
        //Dynamic array
        int num2[]=new int[4];

        num2[0] = 5;
        num2[1] = 4;
        num2[2] = 3;
        num2[3] = 2;

        for(int i = 0; i < 4; i++){
            System.out.println("num2 values - "+num2[i]);
        }
        

    }
}