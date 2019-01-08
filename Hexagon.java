import java.util.Scanner;
import java.lang.Math;
public class Hexagon
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    double side,area,peri;
    System.out.println("Enter side of Hexagon : ");
    side=sc.nextDouble();
    peri=6*side;
    area=(6*side*side)/(4*Math.tan(Math.toRadians(30)));
    System.out.println("Perimeter of hexagon : "+peri);
    System.out.println("Area of hexagon : "+area);
  }
}
