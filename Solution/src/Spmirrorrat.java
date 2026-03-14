import java.util.Scanner;

public class Spmirrorrat 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n = sn.nextInt();
        int i = 1;
        while (i <= n)
        { 
            int j = 1;
            while ( j <= (n - i))
            {
                System.out.print("  ");
                j++;
            }
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
