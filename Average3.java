import java.util.Scanner;
class Average3
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    double avg;
    System.out.print("Enter three numbers : ");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    avg=(a+b+c)/3;
    System.out.println("Average of entered number is : "+avg);
  }
}
