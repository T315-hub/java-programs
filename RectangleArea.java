// constructor

class Rectangle
{
    int l,b;
     // deafult constructor
    Rectangle()
    {
        int l;
        int b;
    }
    Rectangle(int x,int y)  // parametrized constructor
     {
           l=x;
           b=y;
     }
     int area()
     {
         return (l*b);
     }
}
public class RectangleArea {
    public static void main(String[] args) {
        Rectangle  rect2=new Rectangle();

        Rectangle rect=new Rectangle(20,40);
        System.out.println(rect2.area());
        int a2= rect.area();
        System.out.println(a2);

    }
}
