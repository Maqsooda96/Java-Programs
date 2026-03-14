import java.util.Scanner;

public class PrimeFactorization 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sn.nextInt();
        sn.close();

        System.out.print("Prime factors: ");
        primeFactorization(n);
    }

    // Function to print prime factors
    public static void primeFactorization(int n) 
    {
        // Print the number of times 2 divides n
        while (n % 2 == 0) 
        {
            System.out.print(2 + " ");
            n /= 2;
        }

        // Check for odd factors
        for (int i = 3; i * i <= n; i += 2) 
        {
            while (n % i == 0) 
            {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If n is still a prime number greater than 2
        if (n > 2) 
        {
            System.out.print(n);
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) 
    {
        if (num < 2) {
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
