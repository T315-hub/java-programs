public class ankit_34 {
    public static void main(String[] args) {
        for(int i=100;i<=1000;i++)
        {
              int t=i;
              int sum=0;
              while(t>9)
              {
                    while(t>0)
                    {
                        int d=t%10;
                        sum =sum+d;
                        t=t/10;
                    }
                    t=sum;
                    sum=0;
              }
              if(t==1)
              {
                  System.out.print(i + " ");
              }
        }
    }
}
