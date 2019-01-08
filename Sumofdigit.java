import java.util.Scanner;
public class Sumofdigit
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int count=0,num,temp,sum=0,rem;
    System.out.println("Enter a number : ");
    num=sc.nextInt();
    temp=num;
    while(temp!=0)
    {
      rem=temp%10;
      sum=sum+rem;
      temp=temp/10;
    }
    System.out.println("Sum of digits of "+num+" is "+sum);
  }
}
