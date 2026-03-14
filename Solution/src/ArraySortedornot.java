import java.util.Scanner;

public class ArraySortedornot 
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
        
        System.out.println(SortedOrNot(a, n));
        sn.close();
    }

    public static boolean SortedOrNot(int a[], int n)
    {
        
        for(int i = 1; i < a.length; i++)
        {
            if (a[i] < a[i - 1])
            {
                return false;
            }
        }
        return true;
    }
}
