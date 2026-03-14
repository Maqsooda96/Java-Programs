import java.util.Scanner;

public class Countdigits 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number: ");    
        int n = sn.nextInt();
        System.out.println(countnum(n));
        System.out.println(anothercount(n));
        sn.close();
    }
    public static int countnum(int n)
    {
        if (n / 10 == 0)
        {
            return 1;
        }
        return 1 + countnum(n/ 10);
    }
    public static int anothercount(int n)
    {
        int count = 0;
        while(n != 0)
        {
            n = n / 10;
            count++;
        }
        return count;

    }

}
