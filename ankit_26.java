import java.util.Scanner;
public class ankit_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        int fact=1;
        for(int i=number;i>=1;i--) {
            fact = fact * i;
        }
        System.out.println(number+ "!" +" is : " +fact);



    }
}
