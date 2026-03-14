import java.util.Scanner;

public class Stringpattern 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter the first string : ");
        String s1 = sn.nextLine();
        System.out.print("Enter the second string : ");
        String s2 = sn.nextLine();
        System.out.println(findpattern(s1, s2));

        sn.close();
    }

    public static int findpattern (String s1, String s2)
    {
        int fp = s1.indexOf(s2, 0);
        return fp;
    }
}
