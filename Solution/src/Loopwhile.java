import java.util.Scanner;

public class Loopwhile 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sn.nextInt();
        int i = 10;
        while (i >= 1)
        {
             System.out.println(n * i + " ");
             --i;
        }

       
        sn.close();
    }

    

}
