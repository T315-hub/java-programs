import java.util.Scanner;
public class ankit_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
        // A counting number
        for(int i=1;i<=num;i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        // B even number counting
        for(int i=1;i<=num;i++)
        {
            System.out.print(2*i + " ");
        }
        System.out.println();
        // C odd number counting
        for(int i=0;i<num;i++)
        {
            System.out.print(2*i+1 + " ");
        }
        System.out.println();
        // D square
        for(int i=1;i<=num;i++)
        {
            System.out.print(i*i +" ");
        }
        System.out.println();
        // E addition with 2i+1
        int ans=0;
        System.out.print(ans + " ");
        for(int i=1;i<num;i++)
        {
            ans +=2*i+1;
            System.out.print(ans + " ");
        }
        // F addition with 2i+1
        int ans2=2;
        System.out.println();
        System.out.print(ans2 + " ");
        for(int i=1;i<num;i++)
        {
           ans2 += 2*i+1;
            System.out.print(ans2 + " ");
        }
        System.out.println();
        // G fibonacci series
        int a=0;
        int b=1;
        int c;
        System.out.print(a + " ");
        System.out.print(b +" ");
        for(int i=2;i<num;i++)
        {
             c=a+b;
            System.out.print(c + " ");
             a=b;
             b=c;
        }
    }
}
