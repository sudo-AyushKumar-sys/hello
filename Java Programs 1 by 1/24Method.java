//Methods in Java
class Computer {
    public void playMusic(){//Here void meaning it will not return anything
        System.out.println("Music Playing");
    }
    //public void getMeAPen(){//A method when contains void will not return anything
        //So in place of void We will write String to return us String value "Pen"
    public String getMeAPen(int cost){
        return "Pen";
    }
    //Now we have 2 METHODS playMusic(), getMeAPen
}
public class Method {
    public static void main(String[] args){
        Computer com=new Computer();
        com.playMusic();
        String str=com.getMeAPen(10);
        System.out.println(str);      
    }
    
}
