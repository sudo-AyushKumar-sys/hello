class Pen{ //Another class called pen
    //STEP 1:Create a Blueprint
    //STEP 1: Create a class called Pen , its instance and  its method
    String color; //instance
    String type; //instance

    public void write(){  //A method or a function that 
                          // Pen will Write
        System.out.println("Writing");
    }

    public void solve(){
        System.out.println("Solving");
    }
    ////STEP4  How we will print color of a pen
    public void printColor() { // A method or a function
        System.out.println(this.color); //this is keyword of java
        // this method hame btata hai ki konsi object ka konsi instance call kar rhi hai
    }

}
public class OOPS { //class called OOPS
    //STEP2:Now we will create object
    //STEP2:we create object under main function
    public static void main(String[] args) {
        Pen ballPen1 = new Pen();//We created a object Pen
        ballPen1.color = "blue"; //we will access the instance 'color' by dot '.' properties
        ballPen1.type="gel"; //we will access the instance 'type' by dot '.' properties  
    //NOW STEP2 is complete !

    //STEP3 We will call our method
    // now how we will call this method -> public void write(){  
                                   //    System.out.println("Writing"); 
                                    //}
    //We will use dot '.'
    /*STEP3 */ ballPen1.write(); //ballPen1 name of Object pen
                      //write() name of method or function
                      //STEP3 Complete
        //STEP4  How we will print color of a pen in our class Pen{ }
  /*STEP4 */   ballPen1.printColor();


        //We will Create a new Object Pen
        Pen gelPen = new Pen();
        gelPen.color="red";
        gelPen.type="Gel";

        gelPen.printColor();
        gelPen.solve();
    } 
    //STEP5 WILL EXPALIN IN THE NEXT PROGRAM

    //the o/p will be write 
}
