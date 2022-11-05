public class ankit_15 {
    public static void main(String[] args) {
       // swapping two numbers using third variable
        int num1=8;
        int num2=6;
        System.out.println("num1 before swapping :  " + num1);
        System.out.println("num2 before swapping : " + num2);
        int temp;
        temp=num2;
        num2=num1;
        num1=temp;
        System.out.println("num1 after swapping  : " + num1);
        System.out.println("num2 after swapping : " + num2);
    }
}
