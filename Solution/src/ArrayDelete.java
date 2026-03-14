import java.util.Scanner;

public class ArrayDelete 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the capacity of the array : ");
        int cap = sn.nextInt();
        int[] a = new int[cap];

        System.out.print("Enter the capacity of the array (<= capacity) : ");
        int n = sn.nextInt();

        if (n > cap)
        {
            System.out.println("Error: Number of elements cannot be greater than capacity of the array..!!");
            return;
        }
        else if (n == cap)
        {
            System.out.println("Array is full..!!");
            return;
        }
        
        System.out.print("Enter the ("+n+") elements: ");
        for (int i = 0; i < n; i++)
        {
            a[i] = sn.nextInt();
        }

        System.out.print("Enter the delete element : ");
        int x = sn.nextInt();

        n = DeleteElement(n, cap, a, x);

        if (n > 0)
        {
            System.out.println("Updated array ");
            for (int i = 0; i < n; i++)
            {
                System.out.print(a[i] + " ");
            }
        }
        else
        {
            System.out.println("Array is empty after deletion.");
        }

        sn.close();
    }
        public static int DeleteElement (int n, int cap, int a[], int x)
        {
            int i;
            for ( i = 0; i < n; i++)
            {
                if (a[i] == x)
                {
                    break;
                }
                
            }
            if (i == n)
            {
                System.out.println("Element not found");
                return n;
            }
            
            for (int j = i; j < n - i; j++)
            {
                a[j] = a[j + 1];
            }
            return n - 1;
        }
   
}
