import java.util.Scanner;
import java.lang.String;
public class lsnc
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter String : ");
    char[] letter=sc.nextLine().toCharArray();
    int alpha=0,number=0,space=0,other=0;
    for(int i=0;i<letter.length;i++)
    {
      if(Character.isLetter(letter[i]))
      alpha++;
      else if(Character.isDigit(letter[i]))
      number++;
      else if(Character.isSpaceChar(letter[i]))
      space++;
      else
      other++;
    }
    System.out.println("Number of letters : "+alpha);
    System.out.println("Number of Digits : "+number);
    System.out.println("Number of space : "+space);
    System.out.println("Number of other char : "+other);
  }
}
