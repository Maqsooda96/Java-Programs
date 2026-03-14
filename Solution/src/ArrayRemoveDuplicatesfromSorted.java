import java.util.Scanner;

public class ArrayRemoveDuplicatesfromSorted 
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
        n = RemoveDuplicateElements(a, n, cap);
        System.out.print("After : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+ " ");
        }
        sn.close();
    }

    public static int RemoveDuplicateElements (int []a, int n, int cap)
    {
        int res = 1;

        for (int i = 1; i < n; i++)
        {
            if (a[res - 1] != a[i])
            {
                a[res] = a[i];
                res++;
            }
        }
        return res;
    }
}
