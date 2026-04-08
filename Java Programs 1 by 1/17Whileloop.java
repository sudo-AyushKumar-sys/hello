
//for loop
public class Whileloop {
    public static void main(String[] args){
        //repeat this statement 4 times
        //loop- while,do while, for loop
        
        int i =1;

        //WHILE LOOP
        // while(i<=4)
        // {
        //     System.out.println("Hi");
        //     i++;
        // }

        //WHILE NESTED LOOP!!
        while(i<=4)
        {
            System.out.println("hi " + i);
            int j=1;
            while (j<=3) {
                System.out.println("Hello " +j);
                j++;
            }
            
            i++;
        }
      //  System.out.println("bye" + i);
     

    }
}
