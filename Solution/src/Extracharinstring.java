import java.util.Scanner;

public class Extracharinstring 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the string1 :");
        String s1 = sn.nextLine();
        System.out.println("Enter the string2 :");
        String s2 = sn.nextLine();

        int sl1 = s1.length();
        int sl2 = s2.length();

        if (sl1 <= 26 && sl2 <= 26)
        {
            for (int i = 0; i < 26; i++)
            {
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(i);
                if (ch1 >= 'a' && ch1 <= 'z' && ch1 >= 'A' && ch1 <= 'Z')
                {
                    if (ch2 >= 'a' && ch2 <= 'z' && ch2 >= 'A' && ch2 <= 'Z')
                    {
                        int si1 = s1.indexOf(s2);
                        System.out.println("s1 and s2 charing same characters");
                    }
                    else
                    {
                        System.out.println("s1 and s2 charing same characters");
                    }
                }

            }
        }
        else
        {
            System.out.println("Not comparable");
        }
        sn.close();
    }
}
