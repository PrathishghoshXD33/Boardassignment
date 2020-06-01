import java.util.Scanner;
public class employee
{
  String name;
  float basesalary;
  double totalsalry;
  void employee()
  {
      Scanner in=new Scanner(System.in);
      System.out.println("Please enter your name");
      name=in.nextLine();
       System.out.println("please enter salary");
       basesalary=in.nextFloat();
    }
     double salary()
    {
        double Hra=0.5*basesalary;
        totalsalry=basesalary+Hra;
        return totalsalry;
      }
      void display()
      {
          System.out.println("the grosss salary of "+ name + " is " + totalsalry);
        }
     public static void main() 
     {
employee obj=new employee(); 
obj.employee();
double result=obj.salary();
System.out.println(result);
obj.display();
}
}