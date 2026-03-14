import java.util.Scanner;

public class Rightangledforloop 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n = sn.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        } 
        sn.close();   
    }
}
