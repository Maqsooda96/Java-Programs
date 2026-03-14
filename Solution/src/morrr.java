import java.util.Scanner;

public class morrr {

    // Function to find the next prime number after n
    public static int nextPrime(int n) {
        int s = n + 1; // Start checking from the next number

        while (!isPrime(s)) {
            s++; // Keep incrementing until we find a prime number
        }

        return s; // Return the next prime number
    }

    // Helper function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        // Check divisibility from 5 up to sqrt(num), using 6k ± 1 rule
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Driver code to test the function
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        System.out.println("Next prime number after " + n + " is: " + nextPrime(n));
        scn.close();
    }
}
