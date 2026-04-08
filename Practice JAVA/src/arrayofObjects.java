class Learner{
    int roll;
    String name;
    int marks;
}

public class arrayofObjects{
    public static void main(String[] args){

        Learner L1 = new Learner();
        L1.roll = 19;
        L1.name = "abc";
        L1.marks = 91;

        Learner L2 = new Learner();
        L2.roll = 20;
        L2.name = "def";
        L2.marks = 92;

        Learner L3 = new Learner();
        L3.roll = 21;
        L3.name = "ghi";
        L3.marks = 93;


        Learner arr[] = new Learner[3];
        arr[0] = L1;
        arr[1] = L2;
        arr[2] = L3;

        for(int i = 0; i < arr.length; i++){
            arr[0] = L1;
            System.out.println(arr[i].roll + " : " + arr[i].name + " : " + arr[i].marks);
        }

    }
}