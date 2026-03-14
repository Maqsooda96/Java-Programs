import java.util.Scanner;

public class Stringfunctn 
{
public static void main(String[] args) 
{
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = sn.nextLine();
    String sl = str.trim();
    System.out.println(sl);
    int ln = str.length();
    System.out.println(ln);

    System.out.println(str.toUpperCase());
    System.out.println( );
    char c1 = sn.next().charAt(0);
    char c2 = sn.next().charAt(0);
    
    for (char ch = c1; ch <= c2; ch ++)
    {
        System.out.print(ch + " ");
    }
    sn.close();
}
}
