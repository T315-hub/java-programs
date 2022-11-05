import java.util.Scanner;

public class ankit_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int number=sc.nextInt();
        int digits=0;
        int reverseNumber=0;
        while(number>0)
        {
            digits=number%10;
            reverseNumber=((reverseNumber*10)+digits);
            number=number/10;
        }
        System.out.println("the reverse of number is : " +reverseNumber);

    }
}
