import java.util.Scanner;

public class ankit_13 {
    public static void main(String[] args) {
        float profit,loss;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the cost price of an item ");
        float cp=sc.nextFloat();
        System.out.println("entre the selling price of an item ");
        float sp=sc.nextFloat();
        if(sp>cp)
        {
             profit=sp-cp;
            System.out.println("profit  : " + profit);
        }
        else
        {
              loss=cp-sp;
            System.out.println("loss  : " + loss);

        }

    }
}
