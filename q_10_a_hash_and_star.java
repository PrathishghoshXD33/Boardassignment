public class q_10_a_hash_and_star
{
   public static void main(int n)
   {
     for(int i=1;i<=n;i++)
{ 
System.out.print(i+" ");
for(int a=1;a<=i;a++)
{
    if(a%2==0)
    {
        System.out.print("#"+" ");
    }
    else
    {
        System.out.print("*"+" ");
    }
}
System.out.println();
}
}
}
