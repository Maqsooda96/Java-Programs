import java.util.Scanner;

public class Primenum 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter number : ");   
        int n = sn.nextInt();
        boolean prime = true;
        if (n <= 1)
        {
             prime = false;
        }
        else
        {
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    prime = false;
                }
            }
            if(prime)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("False");
            }   
        }
    }
}
