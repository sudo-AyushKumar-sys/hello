//Jsgged and 3D array
public class Array3DArray {
    public static void main(String[] args){
    //How can we make the size of Internal array different to each other
    //This is possible by using Jagged Array
    int nums[][]=new int[3][]; //Jagged Array

    nums[0] = new int[3];//size of internal array
    nums[1] = new int[4];//size of internal array
    nums[2] = new int[2];//size of internal array
    
    for(int i=0;i<nums.length;i++){/*nums.length refers to the number of 
                                        rows in the nums array. */
        for(int j=0;j<nums[i].length;j++){/*Use nums[i].length for j's 
                                            loop condition so it correctly 
                                            iterates over each row’s actual length. */
            nums[i][j]=(int)(Math.random()*100);
            System.out.print(nums[i][j] + " ");
        }System.out.println();
    }
    int num1[][][]=new int[3][4][5];//3-D Array
  }

}
