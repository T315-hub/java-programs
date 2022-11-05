import java.util.Scanner;
public class ankit_22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("choice 1: factorial of number ");
        System.out.println("choice 2: check prime/or not  ");
        System.out.println("choice 3: check even /or not ");
        System.out.println("choice 4: palindrome / or not  ");
        System.out.println("choice 5: armstrong / or not  ");
        System.out.println("choice 6: magic /or not ");
        System.out.println("choice 7: exit");

        System.out.println("enter your choice ");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("enter number ");
                int n=sc.nextInt();
                int fact=1;
                 for(int i=n;i>=1;i--)
                 {
                      fact =fact*i;
                 }
                System.out.println(fact);
                 break;
            }
            case 2:
            {
                System.out.println("enter number ");
                int n=sc.nextInt();
                int count=0;
                for(int i=2;i<n;i++)
                {
                    if(n%i==0)
                    {
                         count++;
                         break;
                    }
                }
                if(count==0)
                {
                    System.out.println("prime number");
                }
                else
                {
                    System.out.println("not a prime number ");
                }
                break;
            }
            case 3:
            {
                System.out.println("enter number ");
                int n=sc.nextInt();
                if(n%2==0)
                {
                    System.out.println("number is even ");
                }
                else
                {
                    System.out.println("number is odd ");
                }
                break;
            }
            case 4:
            {
                System.out.println("enter number ");
                int n=sc.nextInt();
                int number=n;
                int digits=0;
                int reverseNumber=0;
                while(n>0)
                {
                    digits=n%10;
                    reverseNumber=reverseNumber*10+digits;
                    n=n/10;
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
                break;
            }
            case 5:
            {
                System.out.println("enter number ");
                int n=sc.nextInt();
                int number=n;
                int digits=0;
                int sum=0;
                while(n>0)
                {
                    digits=n%10;
                    sum +=Math.pow(digits,3);
                    n=n/10;
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
                break;
            }
            case 6:
            {
                System.out.println("enter number ");
                int n=sc.nextInt();
                int number=n;
                int digits=0,sum=0;
                while(n>9)
                {
                    while(n>0)
                    {
                        digits=n%10;
                        sum=sum+digits;
                        n=n/10;
                    }
                    n=sum;
                    sum=0;
                }
                System.out.println(n);
                if(n==1)
                {
                    System.out.println("its a magic number ");
                }
                else
                {
                    System.out.println("not a magic number ");
                }
                break;
            }
            case 7:
            {
                System.out.println("exit");
            }
        }
    }
}
