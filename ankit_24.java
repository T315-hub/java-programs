import java.util.Scanner;
public class ankit_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int count=1;
        for(int i=1;i<=num;i++)
        {
            // print space  F
            for(int j=num-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {

                System.out.print(j);  // A F
//                System.out.print("1" + " ");  // B
//                System.out.print(i + " ");  // C
//                System.out.print("*" + " ");  // D
//                System.out.print(count + " ");  // E
//                count++;  // E
//                System.out.print((char)('A'+j-1));  // H

            }
            // g print another shape
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        // for pattren i
        for(int i=num-1;i>=1;i--)
        {
            // print space  F
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {

                System.out.print(j);  // A F
            }
            // g print another shape
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
