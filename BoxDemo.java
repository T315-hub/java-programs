class Box
{
    double length;
    double depth;
    double height;
}



public class BoxDemo {
    public static void main(String[] args) {
        Box mybox= new Box();
        Box mybox1=new Box();
        mybox.length=10;
        mybox.height=20;
        mybox.depth=15;
        mybox1.length=60;
        mybox1.height=50;
        mybox1.depth=20;
        // compute volume of box
        double vol = mybox.length* mybox.height* mybox.depth;
        double vol1 = mybox1.length* mybox1.height* mybox1.depth;

        System.out.println(vol);
        System.out.println(vol1);
  }
}
