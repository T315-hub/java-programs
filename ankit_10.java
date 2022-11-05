public class ankit_10 {
    public static void main(String[] args) {
        int a=9;
        int b=4;
        int c=5;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("the largest number out of three number is : " + a);
            }
            else
            {
                System.out.println("the largest number out of three number is : " + c );
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("the largest number out of three number is : " + b );
            }
            else
            {
                System.out.println("the largest number out of three number is : " + c );
            }
        }
    }
}
