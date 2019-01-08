import java.util.Scanner;
import java.lang.Math;
public class Dbe
{
  static double x1,x2,y1,y2;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    double distance;
    System.out.print("Enter latitude of coordinate 1 : ");
    x1=sc.nextDouble();
    System.out.print("Enter longitude of coordinate 1 : ");
    y1=sc.nextDouble();
    System.out.print("Enter latitude of coordinate 2 : ");
    x2=sc.nextDouble();
    System.out.print("Enter longitude of coordinate 1 : ");
    y2=sc.nextDouble();
    distance = compute();
    /*Distance between the two points [ (x1,y1) & (x2,y2)]
      d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
    */
    System.out.println("The distance between two points on earth is : "+distance);
  }
  public static double compute()
  {
    x1=Math.toRadians(x1);
    y1=Math.toRadians(y1);
    x2=Math.toRadians(x2);
    y2=Math.toRadians(y2);
    final double radius=6371.01;
    double distance;
    distance=radius*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
    return distance;
  }
}
