class Nesting
{
    int m,n;
    Nesting(int x,int y)
    {
         m=x;
         n=y;
    }
    int largest()
    {
         if(m>=n)
         {
             return (m);
         }
         else
         {
             return (n);
         }
    }
    void  Display()
    {
         int large= largest();
        System.out.println(large);
    }
}



public class NastingTest {
    public static void main(String[] args) {
        Nesting nest=new Nesting(45,67);
        nest.Display();

    }
}
