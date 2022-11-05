
import java.util.Scanner;
public class ankit_29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int num1=sc.nextInt();
        int number=num1;
        int digits=0;
        int reverseNumber=0;
        while(num1>0)
        {
             digits=num1%10;
             reverseNumber=reverseNumber*10+digits;
             num1=num1/10;
        }
        System.out.println(reverseNumber);
        if(reverseNumber==number)
        {
            System.out.println("it is palindrome number ");
        }
        else
        {
            System.out.println("not a palindrome number ");
        }


    }
}
