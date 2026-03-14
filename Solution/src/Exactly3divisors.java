import java.util.Scanner;

public class Exactly3divisors 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner (System.in);
        System.out.print("Enter the number to find only 3 divisors number which is less than number to enter: ");
        int n = sn.nextInt();
        System.out.println(Divisors(n));
        sn.close();
    }

    static int Divisors(int n)
    {
        int count = 0;
        for (int i = 2; i * i <= n; i++)
        {
            if ( isPrime(i))
            {
                count++;
            }
            
        }
        return count;
    } 

    public static boolean isPrime(int num)
    {   
        if (num < 2)
        {
            return false;
        }
        for (int i = 2; i * i <= num; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
