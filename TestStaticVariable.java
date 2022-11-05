class student
{
    int rollno;
    String name;
    static String college ="starex universiy"; // static variable is used for memory efficient
    student(int r , String n)
    {
           rollno=r;
           name=n;
    }
    void display()
    {
        System.out.println(rollno + " " + name + "  " + college);
    }

}


public class TestStaticVariable {
    public static void main(String[] args) {
        student stu= new student(34,"ankit");
        student stu2=new student(21,"pankaj");
        stu.display();
        stu2.display();
    }
}
