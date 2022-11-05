class Box1 {
    int width;
    int length;

    int Volume() {
       return (length*width);
    }
}




public class BoxDemo3 {
    public static void main(String[] args) {
        Box1 myboxa2=new Box1();
        Box1 myboxa4=new Box1();
        myboxa2.length=40;
        myboxa2.width=30;
        int v1= myboxa2.Volume();
        myboxa4.length=50;
        System.out.println(v1);
        myboxa4.width=90;
        int v2 = myboxa4.Volume();
        System.out.println(v2);
    }
}
