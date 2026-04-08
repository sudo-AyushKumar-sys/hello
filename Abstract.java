abstract class car{
    public abstract void drives();//abstract method - you can implement values later in other class
    //STEP2:if you want to declare a method you can use abstract keyword
    //2 And abstract method declare only in abstract class

    public abstract void flies();//abstract method
    public void playmusic(){
        System.out.println("Play music");
    }
}
    abstract class MarutiSuzuki extends car{ //STEP1:i want this alto class to implement he drive feature
    public void drives(){
        System.out.println("Driving");
    }
}
    class Suzuki extends MarutiSuzuki{
        public void flies(){
            System.out.println("Flying");
        }
    }

public class Abstract{
    public static void main(String[] args) {
        //car obj  = new car(); //cannot create object of abstract class
        car obj = new Suzuki();//can create object of abstract if reference class Suzuki
        obj.drives();
        obj.flies();
        obj.playmusic();
    }
}