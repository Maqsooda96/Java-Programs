import java.util.Scanner;

public class BrCt 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        
        
        for(int i = 0; i < 5; i++)
        {
            int x = sn.nextInt();
            int y = sn.nextInt();
            if( y ==0)
            continue;
            System.out.println(x/y);
        }
        }
}
