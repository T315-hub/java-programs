public class ankit_39 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        float b=0;
        float a= arr.length;
        for(int i=1;i< arr.length;i++)
        {
             b=b+arr[i];
        }
        System.out.println("sum of array elemnet :  " + b);
        float avg=b/a;
        System.out.println("average is : " + avg);
    }
}
