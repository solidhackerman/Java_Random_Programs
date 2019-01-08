import java.util.Scanner;
class Multiply
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=a*b;
    System.out.println("The sum of "+a+" and "+b+" is "+c);
  }
}
