
import java.util.Scanner;
public class ankit_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int number=sc.nextInt();
        int digits=0;
        int sum=0;
        while(number>0)
        {
               digits=number%10;
               sum=sum+digits;
               number=number/10;
        }
        System.out.println("sum of digits of any number is : " + sum);

    }
}
