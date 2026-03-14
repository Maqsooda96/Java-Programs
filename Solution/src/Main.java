import java.util.Scanner;
class Point
{
 int l;
 int k;
}

public class Main 
{
    public void print()
    {
        System.out.println("GFGHello");
    }
    public void print(String s)
    {
        System.out.println(s);
    }
    public static void main(String[] args) 
    {
        System.out.println("GFG!!!");
        System.out.println(args.length );

        System.out.println("Main");
        fun1();
        System.out.println("The End");

        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int x = sn.nextInt();
        int y = sn.nextInt(); 

        System.out.println(GetFax(x, y));
       
        int z = 5;
        fun(z);  // 10
        System.out.println(z); //5

        Point p = new Point();
        p.l = 5;
        p.k = 10;
        funn(p);
        System.out.println(p.l +"" +p.k);
    }

    public static int returnValueFunction(int n) 
    {
        
        return n * 2;
    }

    public static void funn( Point p)
    {   
        p.l = 10;
        p.k = 10;
    }

    public static void fun1()
    {
        System.out.println("Call fun 1");
        fun2();
        System.out.println("End of fun1");
    }

    public static void fun2()
    {
        System.out.println("Call fun 2");
    }

    public static int GetFax( int x, int y)
    {
     int sum = x + y;
     
     if(x > y)
     {
       System.out.println(x);
     }
     else
     {
        System.out.println(y);
     }
         return sum;
    }
   public static void fun( int z)
   {
      z = z + 5;
      System.out.println(z);
   }
}



