import java.util.Scanner;
class Rectangle
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    double h,w;
    double peri,area;
    System.out.println("Enter height and width of rectangle : ");
    h=sc.nextDouble();
    w=sc.nextDouble();
    peri=2*(w+h);
    area=w*h;
    System.out.println("Perimeter of rectangle is : "+peri);
    System.out.println("Area of rectangle : "+area);
  }
}
