import java.util.Scanner;

public class ArrayInserAtEnd 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("enter the capacity of the array : ");
        int cap = sn.nextInt();
        int[] a = new int[cap];
        
        System.out.print("Enter the elements <= capacity : ");
        int n = sn.nextInt();
       
        if (n > cap)
        {
            System.out.println("Error: Number of elements cannot be greater than capacity of the array..!!");
            return;
        }
        else if (n == cap)
        {
            System.out.print("Array is full..!!");
            return;
        }

        System.out.print("Enter the position (1 to "+(n + 1) +") elements : ");
        for (int i = 0; i < n; i++)
        {
            a[i] = sn.nextInt();
        }

        System.out.print("Enter the element to insert : ");
        int x = sn.nextInt();

        n = InsertAtEnd(cap, a, n, x);

        if (n > 0)
        {
            for (int i = 0; i < n; i++)
            {
                System.out.print(a[i] + " ");
            }
        }
        sn.close();
    }

    public static int InsertAtEnd(int cap, int a[], int n, int x)
    {
        a[n] = x; // insert at end
        return n + 1;
    }
}
