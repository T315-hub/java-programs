import java.util.Scanner;

public class ankit_31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int num1=sc.nextInt();
        int number=num1;
        int digits=0,sum=0;
        while(num1>9)
        {
            while(num1>0)
            {
                 digits=num1%10;
                 sum=sum+digits;
                 num1=num1/10;
            }
            num1=sum;
            sum=0;
        }
        System.out.println(num1);
        if(num1==1)
        {
            System.out.println("its a magic number ");
        }
        else
        {
            System.out.println("not a magic number ");
        }
    }
}
