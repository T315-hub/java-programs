import java.util.Scanner;



public class ankit_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marital status ");
        String maritalStatus=sc.next();
       if(maritalStatus=="married")
       {
           System.out.println("driver is to be insured by the company ");
       }
       else
       {
//           System.out.println("enter the gender");
           String gender=sc.nextLine();
//           System.out.println("enter your age ");
           int age =sc.nextInt();
           if(gender=="male" || age>30)
           {
               System.out.println("driver is to be insured by the company ");
           }
           else
           {
               System.out.println("driver is to be insured by the company ");
           }
       }

    }
}
