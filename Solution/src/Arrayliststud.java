import java.util.ArrayList;
import java.util.Scanner;

public class Arrayliststud 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        ArrayList <Integer> al = new ArrayList<>();
        for (int  i = 0; i < n; i++)
        {
            int num = sn.nextInt();
            al.add(num);
        }
        System.out.println(al);
        sn.close();
    }
}
