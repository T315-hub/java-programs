public class ankit_08 {
    public static void main(String[] args) {
        float p = Float.parseFloat(args[0]);
        float r = Float.parseFloat(args[1]);
        float t = Float.parseFloat(args[2]);
        double simpleInterest=(p*r*t)/100;
        System.out.println("simple interest is : " +simpleInterest);
    }
}
