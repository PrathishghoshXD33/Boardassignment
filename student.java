import java.util.Scanner;
public class student
{
    String name;
    int rollno;
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int sub5;
    double avg;
    void student()
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter your name");
      name=scan.nextLine();
      System.out.println("enter your Roll No.");
      rollno=scan.nextInt();
      System.out.println("enter your marks in the following subjects out of hundred");
      System.out.println("enter marks in english");
      sub1=scan.nextInt();
      System.out.println("enter marks in second language");
      sub2=scan.nextInt();
      System.out.println("enter marks in maths");
      sub3=scan.nextInt();
      System.out.println("enter marks in science");
      sub4=scan.nextInt();
      System.out.println("enter marks in SST");
      sub5=scan.nextInt();
      scan.close();
    }
    void calc()
    {
      avg=( sub1+sub2+sub3+sub4+sub5)/5;
    }
    void allotment()
    {
     if(avg>=90)
     {
System.out.println("Science with computers");
}
else if((avg>=80)&&(avg<=89))
{
   System.out.println("Science without computers");
}
else if((avg>=60)&&(avg<=69)) 
{
    System.out.println("Commerce without maths");
}
else
{ 
  System.out.println("arts");
}
}
public static void main ()
{
   student obj=new student();
   obj.student();
   obj.calc();
   obj.allotment();
}
}