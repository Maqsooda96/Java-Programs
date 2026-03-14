import java.util.Scanner;
public class LoopsEx 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i<= 10; i++)
        {
            System.out.println("GFG " +i);
        }

        for (int i = 5; i<= 10; i++)
        {
            System.out.println("GFGGFG " +i);
        }

      //  for ( ; ; ) // infinite loop
     //   {
     //       System.out.println("Learn");
     //   }
        
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sn.nextInt();
          
        System.out.println("Enter the number : ");
        int y = sn.nextInt();

        System.out.println("Number for reverse multiplication table: ");
        int a = sn.nextInt();
       
       condition(n);
       loopCondition();
       mult();
       decrease(y);
       sn.close();
    }
    
    public static void condition(int n)
    { 
       while(n < 10)
        {
            System.out.println("GFG " +n);
            n++;
                
        }
    }

    public static void loopCondition()
    {
        for(int i = 0; i <= 5; i++)
        {
            System.out.println("Welcome to Loop world...!!! " +i);
        }
    }

    public static void mult()
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sn.nextInt();

        for (int i = 1; i <= 10; i++)
        {
             System.out.println( i * x) ;
            
        }
       
    }

    public static void decrease(int y)
    {   
        Scanner sn = new Scanner(System.in);

        
        while (y > 0)
        {
            
            System.out.print(--y + " ");
        }
    }

    
    
}
