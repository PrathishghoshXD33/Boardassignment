public class banking
{
    public static void main( double principal, double r, int n_yr, int n_m, char opt)
    {
        double amt;
        switch(opt)
        {
           case'1':
            amt=principal*Math.pow((1+r/100),n_yr);
            System.out.println(amt);
            break;
           case'2':
            amt=principal*n_m + principal*n_m*r*(n_m+1)/2400;
           System.out.println(amt);
           break;
           default:
           System.out.println("only 2 options available");
           break;
        }
    }
}
           
           
           
