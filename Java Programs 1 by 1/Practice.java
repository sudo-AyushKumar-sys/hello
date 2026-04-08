class Human{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    } 
    public void setName(String n){
        name=n;
    }
    public void setAge(int a){
        age=a;
    }
}

public class Practice{
    public static void main(String[] args){

        Human obj1= new Human();
        //obj1.name="Adam";
        //obj1.age=19;

        obj1.setName("Eve");
        obj1.setAge(18);

        System.out.println(obj1.getName()+" "+obj1.getAge());
        

       // System.out.println(obj1.name+" "+obj1.age);
    }
}