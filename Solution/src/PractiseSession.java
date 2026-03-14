import java.util.Scanner;

public class PractiseSession 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Entre the number : ");
        String s = sn.nextLine();

        int st = s.length();
        System.out.println(s.split(" ").length);
    }
}
