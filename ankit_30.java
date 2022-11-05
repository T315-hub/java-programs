
import java.util.Scanner;

public class ankit_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int num1=sc.nextInt();
        int number=num1;
        int digits=0;
        int sum=0;
        while(num1>0)
        {
              digits=num1%10;
              sum +=Math.pow(digits,3);
              num1=num1/10;
        }
        System.out.println(sum);
        if(sum==number)
        {
            System.out.println("it is armstrong number ");
        }
        else
        {
            System.out.println("not a armstrong number ");
        }
    }
}
