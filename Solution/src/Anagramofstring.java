import java.util.Arrays;
import java.util.Scanner;

public class Anagramofstring 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
       
        System.out.print("Enter the first string : ");
        String s1 = sn.nextLine();
        
        System.out.print("Enter the second string : ");
        String s2 = sn.nextLine();
        
        sn.close();
        
        System.out.println(anagramstring(s1, s2));
        
    }

    public static boolean anagramstring (String s1, String s2)
    {
        if (s1.length() != s2.length())
        {
            return false;
        }
        char a1[] = s1.toCharArray(); //converting 1st string to chararray
        Arrays.sort(a1); //sorts the characters in ascending order
        s1 = new String(a1); //converts the sorted array back into a string

        char a2[] = s2.toCharArray(); 
        Arrays.sort(a2);
        s2 = new String(a2);
        
        return s1.equals(s2);
    }
}
