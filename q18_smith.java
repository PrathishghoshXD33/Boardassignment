public class q18_smith
{
   public static void main(int x)
   {
       int a=x;
       int b=x;
       int suma=0;
       int sumb=0;
       for(int i=2;i<a;i++)
       {
           int c=0;
             for(int j=2;j<i;j++)
           {
               if(i%j==0)
               {
                   c++;
                }
            }
            if(c==0)
            { 
                int d=a;
                while(d%i==0)
                {
                   d=d/i;
                   int f=i;
                   while(f!=0)
                   {
                       int rem=f%10;
                   suma=suma+rem;
                   f=f/10;
                }
            }
        }
       }
       while(b!=0)
       {
           int r=b%10;
           b=b/10;
           sumb=sumb+r;
     }
     if(suma==sumb)
     {
         System.out.println("is a smith number");
        }
        else
        {
          System.out.println("is not a smith number");  
    }
 }
}