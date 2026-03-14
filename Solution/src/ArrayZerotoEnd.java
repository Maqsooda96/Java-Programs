import java.util.Scanner;

public class ArrayZerotoEnd 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
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
        MoveZero(a, n);
        
        System.out.print("After : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+ " ");
        }
        sn.close();
    }

    public static void MoveZero (int a[], int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] != 0)
            {
               a[count++] =a[i];
            }
        }
        for (int i = count; i<n;i++)
        {
            a[i] = 0;
        }
    }        
}
