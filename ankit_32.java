public class ankit_32
    {
        public static void main(String[] args) {
           for(int i=100;i<=1000;i++)
           {
                  int t=i;
               int ans=0;
                 while(t!=0)
                 {
                       int d=t%10;
                       ans +=d*d*d;
                       t=t/10;
                 }
                 if(ans==i)
                 {
                     System.out.println(i);
                 }
           }
        }
    }

