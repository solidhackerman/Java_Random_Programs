import java.util.Scanner;
import java.lang.Math;
public class Polygon
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    double side,peri,area,pi=180;
    int n;
    System.out.print("Enter number of side of Polygon : ");
    n=sc.nextInt();
    System.out.print("Enter length of Polygon : ");
    side=sc.nextDouble();
    pi=Math.toRadians(180);
    peri=n*side;
    area=(n*side*side)/(4*Math.tan(pi/n));
    System.out.println("Perimeter of polygon : "+peri);
    System.out.println("Area of polygon : "+area);
  }
}
