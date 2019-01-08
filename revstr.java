//import java.lang.String;
import java.util.Scanner;
public class revstr
{
  public static void main(String[] args)
  {
    String s;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string : ");
    //char[] letters=sc.nextLine().toCharArray();
    s=sc.nextLine();
    char[] letters=s.toCharArray();
    System.out.println("Reverse string : ");
    for(int i=letters.length-1;i>=0;i--)
    {
      System.out.print(letters[i]);
    }
    System.out.print("\n");
    int i=0;
    System.out.print("Original string traversed through array : ");
    while(i<letters.length) //Another way to traverse char array or string. P.S. dont use letters[i]!='\0' condition.
    {
      System.out.print(letters[i]);
      i++;
    }
    System.out.print("\n");
  }
}
