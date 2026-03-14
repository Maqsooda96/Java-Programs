import java.util.Scanner;
public class Divisorsofnum 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the numer : "); 
        int n = sn.nextInt();
        int i = 1;
        while (i <= n)
        {
            if ( n % i == 0)
            {   
               
               System.out.print(i + ", ");
            } 
            i++;
        }
        
    }
}
