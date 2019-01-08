import java.util.Scanner;
class Calculator
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Enter first number : ");
    a=sc.nextInt();
    System.out.println("Enter second number : ");
    b=sc.nextInt();
    System.out.println("Addition : "+(a+b));
    System.out.println("Subtraction : "+(a-b));
    System.out.println("Multiplication : "+(a*b));
    System.out.println("Division : "+(a/b));
    System.out.println("Mod : "+(a%b));
  }
}
