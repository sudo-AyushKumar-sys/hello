class Human{
    //STEP2: We can make our variable Private
    private int age=12;/* //This variable accessible only in the same class
     no one from the outside world can access it */
    private String name="Ayush";

    /*STEP3: The way they can access my data is by asking it 
     * the way they can access it is by using methods */

     public int getAge(){//This method can return the integer value
        return age;//You can access age variable inside the method of same class
     }

     public String getName(){
        return name;
     }

}
class Animal{
    private int age;//What if we want to set the name after
    private String name;

    public int getAge2(){
        return age;
    }
    //STEP5:We have to create a new Method 
    public void setAge2(int age){//int a= accept the value here in 'a'
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public void getName2(String name){
        this.name = name;
    }

}

public class Encapsulation {
    public static void main(String[] args){

        Human obj = new Human();
        // obj.age=12;//STEP5:
        // obj.name="Ayush";
        //STEP1:Just by using the object anyone can fetch the data
        System.out.println(obj.getName()+" "+obj.getAge());/*STEP4: Syntax to 
        access private data S.out.(obj.Method()) */

        Animal obj2 = new Animal();
        obj2.setAge2(20);//We pass the age of obj2  Here
        //This value will assigned to 'a' and then age
        obj2.getName2("Tiger");
        
    }
}
