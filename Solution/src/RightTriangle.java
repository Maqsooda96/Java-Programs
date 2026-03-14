import java.util.Scanner;

public class RightTriangle 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number right angled triangle: ");
        int n = sn.nextInt();
        int i = 1;
        while(i <= n)
        {
            int j = 1;
            while( j <= i)
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

