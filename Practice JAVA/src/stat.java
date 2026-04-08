// Static variable
class School{ //class
    static String SchoolName;
    String StudentName;
}

public class stat{
    public static void main(String[] args){
        School.SchoolName = "DPS";

        School naam = new School();//object
        naam.StudentName = "tony";

        System.out.println(School.SchoolName);
        System.out.println(naam.StudentName);
    }
}