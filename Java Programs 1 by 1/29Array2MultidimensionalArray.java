public class Array2MultidimensionalArray {
    public static void main(String[] args){
        int nums[][]=new int[3][4];
        
        
        
       //We use Math.random to random assign values is our array 
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=(int)(Math.random()*100);
                System.out.print(nums[i][j]+ " ");
            }System.out.println();
        }


        //  for(int i=0;i<3;i++){
        //      for(int j=0;j<4;j++){
        //          System.out.print(nums[i][j] + " ");
        //     }
        //      System.out.println();
        //                             /*Prints zeroes after new line
        //                             0 0 0 0
        //                             0 0 0 0 
        //                             0 0 0 0 */
        //      }
             
    }
}
