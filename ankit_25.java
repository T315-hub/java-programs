import java.util.Scanner;


public class ankit_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int number=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
             int table=number*i;
            System.out.println(number + "*" + i + "=" +table);
        }

    }
}
