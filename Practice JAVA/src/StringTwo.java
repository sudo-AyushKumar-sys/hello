// String Buffer and String Builder
public class StringTwo{
    public static void main(String[] args){
        // StringBuffer in mutable whicha cna change its name
        StringBuffer sb = new StringBuffer(" Ayush "); //gives bufferSize of 16bytes + # of char
         System.out.println(sb.capacity());
         System.out.println(sb.length());

         //it can append (change, include)the data
        sb.append(" Kumar");
        System.out.println(sb);

        //convert stringBuffer to String
        String str = sb.toString();

        //delete the data
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
}