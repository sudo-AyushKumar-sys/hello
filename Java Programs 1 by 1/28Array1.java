//Array
public class Array1 {
    public static void main(String[] args){
    //STEP1 Create an array
        //int nums[] = {3,7,2,4};

        //STEP2 To print an array
        // System.out.println(nums[0]);//To print an array
                       /*  nums[1] is index of array and 
                             value print is 7 */
        //STEP3 changing the values in array
        int num1[]={1,2,3,4};
        num1[0]=7;/*STEP3 We changed the value of element= 
                    address 0 to 7 */ 

        // System.out.println(num1[0]);//Here it will print 1
                                    //Now it will print 7
                
        //STEP4: Dyanmic Array
        int num2[]=new int[4];

        //Assiginng values
        num2[0]=4;
        num2[1]=3;
        num2[2]=2;
        num2[3]=1;

        //System.out.println(num2[0]);
        //How to print all its values 
        for(int i=0;i<4;i++)
        {
            System.out.println(num2[i]);
        }
        

    }
    
}
