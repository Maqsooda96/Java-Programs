import java.util.Scanner;

public class Exercise 
{
    public static void main(String[] args) 
    {
        int ab = 5;
        switch (ab++) 
        {
        case 5:
            System.out.println("First");
        case 6:
            System.out.println(ab++);
            break;
        case 7:
            System.out.println("YES");
        } 
        System.out.println();
    

        int n;
        
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = sn.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("Sum of n number is; " +sum);
        
    }
}
