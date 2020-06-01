public class demo_overloading
{
     void add(int a,int b)
    {
        System.out.println(a+b);
    }
     void add(double a, double b)
    {
    System.out.println(a+b);
}
 void add(float a, float b)
    {
    System.out.println(a+b);
}
 void add(long a, long b)
    {
    System.out.println(a+b);
}
 void add(char a, char b)
    {
    System.out.println(a+b);
}
 void add(String a, String b)
    {
    System.out.println(a+b);
}
public static void main()
{
 demo_overloading obj=new demo_overloading();
 obj.add(5,78);
 obj.add(43.45,5.6);
 obj.add(34.9f,2.8f);
 obj.add(7890l,567l);
 obj.add('@',' ');
 obj.add("rrrr","r");
 
}
}
