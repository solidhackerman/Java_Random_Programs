import java.util.Scanner;
class Circle
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    final double pi=3.14;
    double area,peri;
    double radius;
    System.out.println("Enter radius of circle : ");
    radius=sc.nextDouble();
    peri=2*pi*radius;
    area=pi*radius*radius;
    System.out.println("Perimeter = "+peri);
    System.out.println("Area = "+area);
  }
}
