public class q5letternumber
{
  public static void main (int choice,int n)
   {
       switch(choice)
       {
           case 1:
       char ch='a';
       int hj=ch+n-1;
       char chx=(char)hj;
       for(int i=1;i<=n;i++)
       {
           for(ch='a';ch<=chx;ch++)
           {
               System.out.print(ch+ " ");
            }
            System.out.println();
            chx--;
        }
        break;
        case 2:
       for(int a=1;a<=n;a++)
       {
           for(int b=1;b<=a;b++)
           {
               System.out.print(b+" ");
            }
            System.out.println();
        }
        break;
        default:
        System.out.println("only 2 options available");
    }
    }
}