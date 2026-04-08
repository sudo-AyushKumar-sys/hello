public class Sting {
    public static void main(String[] args){
        //STEP1 To create a String variable
      //  String name="Navin";
       //String name=new String("Navin");
        //Methods we can use in Strings
       
        // System.out.println("Hello " + name);
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat(" reddy"));

        //PART 2 Mutable vs Immutable String in JAVA
        /*Same string we use multiple times 
         * So java Store there strings in STRING CONSTANT POOL
         * Which has all String values but no repeatable values
         */
        String s1="Navin";//Here we donot have 2 objects we have 2 references s1,s2
        String s2="Navin";//In total we got only 1 object
        System.out.println(s1==s2);

    }
}
