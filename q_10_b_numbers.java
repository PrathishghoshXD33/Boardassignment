public class q_10_b_numbers
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}