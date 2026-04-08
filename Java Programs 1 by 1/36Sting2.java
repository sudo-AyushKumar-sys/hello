//StringBuffer and StringBuilder
public class Sting2 {
    public static void main(String[] args ){
         //StringBuffer is Mutable Which we can change it
            // StringBuffer sb=new StringBuffer();
        
        //StringBuffer will give us a buffersize of 16 Bytes
        //System.out.println(sb.capacity()); 

        //STEP1:Create a StringBuffer
        StringBuffer sb1 = new StringBuffer("Navin");//we can change the data
        //Now its capacity will change to 21 bytes
           //System.out.println(sb1.capacity());
        
        //STEP2:To print the length of the String
           //System.out.println(sb1.length());
        
        //STEP3:can we append (change,include) the Data
        sb1.append(" REddy");
        System.out.println(sb1);

        //STEP4:To convert StringBuffer Data to String
          //String str=sb1.toString();

        //STEP5:To Delete a data
        sb1.deleteCharAt(2);
        System.out.println(sb1);
    }
}
