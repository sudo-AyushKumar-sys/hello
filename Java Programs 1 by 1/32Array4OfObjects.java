//Array of Objects
//We can use normal objects in arra y to show data 
class Student{
    int rollno;
    String name;
    int marks;
    public int roll;

}
public class Array4OfObjects {
    public static void main(String[] args)
    {
        
        Student s1=new Student();
        s1.rollno=1;
        s1.name="abc";
        s1.marks=99;

        Student s2=new Student();
        s2.rollno=2;
        s2.name="def";
        s2.marks=88;

        Student s3=new Student();
        s3.rollno=3;
        s3.name="ghi";
        s3.marks=77;
//We are creating an array which can hold Student refrences
        Student hi[]=new Student[3];//hi is array; Student[3] is array of size 3
        hi[0]=s1; //s1 is object
        hi[1]=s2;
        hi[2]=s3;
        //use is If we have to print all the data of the Students
        
     //   System.out.println(s1.rollno+" : "+s1.name+" : "+s1.marks);
        for(int i=0;i<hi.length;i++){
            System.out.println(hi[i].name+" : "+hi[i].marks);
        }
        
        /*
        int num[]=new int[6];
        num[0]=4;
        num[1]=7;
        num[2]=3;
        num[3]=9;

        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    
 */
    }
}
