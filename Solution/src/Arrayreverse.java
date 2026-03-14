import java.util.Scanner;
public class Arrayreverse 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the size of the array: "); 
        int n = sn.nextInt();
        int []a = new int[n];    
        System.out.print("Enter the " + n + " number of array elements : ");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sn.nextInt();
        }

        for (int i = 0; i <a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = n - 1; i >= 0;i--)
        {
            System.out.print(a[i]+ " ");
        }
        evenodd(a, n);
        sn.close();
    }
    
    public static void evenodd (int a[], int n)
    {
        System.out.print("\n");
        for (int i = 0;i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i] + " ");
            }
        }
        System.out.print("\n");
        for (int i = 0;i < a.length; i++)
        { 
            if(a[i] % 2 != 0)
            {
                 System.out.print(a[i]+ " ");
            }
        } 
    } 
}
