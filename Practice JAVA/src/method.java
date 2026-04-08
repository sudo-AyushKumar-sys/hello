//step 1 : create class
class computer{
    //step 2 create 2 method
    public void playMusic(){ //Method 1
        System.out.println("Music is playing ");
    }
    public String getMeAPen(int cost){//Method 2
        return "Pen";
    }
}

public class method{
    public static void main(String[] args) {
        computer com = new computer();
        com.playMusic();
        String str = com.getMeAPen(10);
        System.out.println(str);
    }
}