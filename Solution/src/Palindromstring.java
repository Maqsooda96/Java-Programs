import java.util.Scanner;
public class Palindromstring 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the string to check whether it is palindrome or not : ");
        String s = sn.nextLine();

        System.out.println(ispalindrome(s));
        sn.close();
    }

    public static boolean ispalindrome (String s)
    {
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end)
        {
             if (s.charAt(start) != s.charAt(end))
             {
                return false;
                
             }
             start ++;
             end--;
        }
        return true;
    }

}
