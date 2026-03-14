import java.util.Scanner;

public class ArrayInsert 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner (System.in);
        System.out.print("Enter the capacity of the array : ");
        int cap = sn.nextInt();
        int[] a = new int[cap];
        
        System.out.print("Enter the elements <= capacity : ");
        int n = sn.nextInt();

        if (n > cap)
        {
            System.out.print("Error: number of elements cannot be greater than capacity of the array..!");
            return;
        }

        else if (n == cap)
        {
            System.out.println("Array size is full.!");
            return;
        }

        System.out.print("Enter the "+n+ " elements : ");
        for (int i = 0; i < n; i++)
        {
            a[i] = sn.nextInt();
        }

        System.out.print("Enter the element to insert : ");
        int x = sn.nextInt();

        System.out.print("Enter the position (1 to "+(n + 1) +") elements : ");
        int pos = sn.nextInt();

        n = InsertElement(n, a, cap, x, pos);

        if (n > 0)
        {
            for (int i = 0; i < n; i++)
            {
                System.out.print(a[i] + " ");
               
            }
        }
         sn.close();
    }

    public static int InsertElement(int n, int a[], int cap, int x, int pos)
    {
        if (pos < 1 || pos > n + 1)   //index = pos - 1
        {
          System.out.println("Invalid position!!"); 
          return n; 
        }
        
        for (int i = n; i > pos - 1; i--)
        {
            a[i] = a[i - 1]; // insert at position
        }
        a[pos - 1] = x;
        return n + 1;
    }
}
