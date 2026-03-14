import java.util.Scanner;

public class Palindromdigits 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number : ");  
        int n = sn.nextInt();
        System.out.println(palindrom(n));

        sn.close();
    }
    public static boolean palindrom(int n)
    {
        int rev = 0;
        int temp = n;
        while(temp != 0)
        {
            rev = (rev * 10 ) + (temp % 10);
            temp = temp / 10;
        }
        return (rev == n);
    }
}
