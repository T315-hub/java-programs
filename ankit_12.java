
import java.util.Scanner;

public class ankit_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first angle of a triangle");
        int angle1=sc.nextInt();
        System.out.println("enter second angle of triangle ");
        int angle2=sc.nextInt();
        System.out.println("enter third angle of triangle ");
        int angle3=sc.nextInt();
        if((angle1+angle2+angle3==180))
        {
            System.out.println("triangle is valid because sum of angle pof triangle is 180 degree ");
        }
        else
        {
            System.out.println("triangle is not valid ");
        }

    }
}
