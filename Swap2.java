import java.util.Scanner;
class Swap2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num1,num2,temp;
    System.out.println("Enter two numbers : ");
    num1=sc.nextInt();
    num2=sc.nextInt();
    System.out.println("Twp number in order : "+num1+" "+num2);
    temp=num1;
    num1=num2;
    num2=temp;
    System.out.println("Two number after swap : "+num1+" "+num2);
  }
}
