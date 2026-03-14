import java.util.Scanner;

public class StringJava 
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Entre the String for evaluating the string functions:");
        String st = sn.nextLine();
        String st1 = sn.nextLine();
        String st2 = sn.nextLine();

        char ch = st.charAt(4);
        System.out.println(ch);

        stringfun(st, st1, st2);

        sn.close();
    }

    public static void stringfun(String st, String st1, String st2)
    {   
        System.out.println(st1.compareTo(st2));
        System.out.println(st1.indexOf(st2));
        System.out.println(st1.indexOf(st2, 2));

        String s = st1 + "geeks";
        System.out.println(s == st);

        System.out.println((char) st.length());
        
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.concat(st1));
        System.out.println(st1.equalsIgnoreCase(st2)); //works will be same not care about strings are in upper or in lower case. Condition will be true

        if (st == st1)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not same");
        }

      //  System.out.println(st1.compareTo(s));
        System.out.println(st.equals(st1));
        System.out.println(st1.equals(st2));
       
    }
}
