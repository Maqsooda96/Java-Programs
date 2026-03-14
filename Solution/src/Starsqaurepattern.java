import java.util.Scanner;

public class Starsqaurepattern 
{
    public static void main(String [] args)
    {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        
        int i = 1;
        while( i <= n)
        {
            int j = 1;
            while (j <= n)
            {
                System.out.print("* ");
                j++;
            }
            i++;
           System.out.println();
        }
        sn.close();
    }
}
