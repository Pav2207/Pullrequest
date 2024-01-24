
import java.util.Scanner;
class student {

    int roll_no;
    String name;
    int mark;

    public student( int roll_no,String name,int mark)
    {
        this.roll_no=roll_no;
        this.name=name;
        this.mark=mark;
    }
}
public class Main {
    public static void main(String[] args) {

        student karthik=new student(22,"karthik",45);
        student raju=new student(25,"raju",78);
        System.out.println(raju.mark);



    }
}