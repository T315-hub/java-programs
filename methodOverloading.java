class Room
{
    float length;
    float breadth;
    Room(float x ,float y)  // constructor 1
    {
           length=x;
           breadth=y;
    }
    Room(float x)   // constructor 2
    {
        length=breadth=x;
    }
    float area()
    {
        return (length * breadth);
    }
}





public class methodOverloading {
    public static void main(String[] args) {
        Room room1=new  Room(30,60);
        Room room2=new Room(80);
        float r1=room1.area();
        float r2=room2.area();
        System.out.println(r1);
        System.out.println(r2);

    }
}
