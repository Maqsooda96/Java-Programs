import java.util.Scanner;

public class Nextprimenum 
{
    public static void main(String[] args) 
    {
        // A more efficient JAVA program
// to check if a number is prime

        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int s = n + 1;
        boolean prime = true;
        if (s == 1)
            prime = false;

        if (s == 2 || s == 3)
            prime = true;

        if (s % 2 == 0 || s % 3 == 0)
            prime = false;

        for (int i = 5; i * i <= s; i = i + 6) 
        {
            if (s % i == 0 || s % (i + 2) == 0)
                prime = false;
        }
        s++;
        System.out.println( s + " "+ prime);
    }
   
}
