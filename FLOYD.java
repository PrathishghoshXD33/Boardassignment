public class FLOYD
{
    public static void main(int n)
    {
        int i,j,k=1;
    for(i=1;i<=n;i++)
{
   for(j=1;j<=i;j++,k++)
   {
       System.out.print(k+" ");
    }
   System.out.println();
}
}
}