import java.util.Scanner;

public class Break 
{
    public static void main(String[] args) 
    {
        int i;
        for(  i = 0; i < 5; i++)
        {
            if( i == 3)
                break;
            System.out.println(i);
        }
        System.out.println(" " +i);
        
        fun();

        Scanner sn = new Scanner(System.in);
        System.out.println("number: ");
        int n = sn.nextInt();
        System.out.println(count(n));


        sn.close();
    }

    public static void fun()
    {
        for( int i = 0; i < 2; i++)
        {
            for( int j = 0; j < 2; j++)
            {
                if (j == 1)
                    break;
                   System.out.println(j); 
            }
            System.out.println(i);
        }
    }

    public static int count(int n)
    {
        int count = 0;
        while( n > 0)
        {
            n = n / 10;
        count = count + 1;
        }
        return count;
    }
}
