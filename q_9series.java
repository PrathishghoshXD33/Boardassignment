public class q_9series
{
    public static void main(int choice, int x)//
    {
        switch(choice)
        {
            case 1:
            int sum=0;
            for(int i=1;i<=x;i++)
            {
                if(i%2==0)
                {
                    int t=i*(-2);
                    sum=sum+t;
                }
                else
                {
                    int t=i*(2);
                    sum=sum+t;
                }
            }
            System.out.println(sum);
            break;
            case 2:
            double sum_=0;
            for(int j=2;j<=20;j=j+3)
            {
                double e=x/j;
                sum_=sum_+e;
            }
            System.out.println(sum_);
            break;
            default:
            System.out.println("error");
        }
    }
}