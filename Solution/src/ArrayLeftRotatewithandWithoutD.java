import java.util.Scanner;

public class ArrayLeftRotatewithandWithoutD 
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
        LeftRotate(a, n);

        System.out.print("After : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.print("Enter value to move left by d positions : ");
        int d = sn.nextInt();

        LeftRotateByD(a, n, d);

        System.out.print("After D position : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+ " ");
        }

        sn.close();
    }

    static void LeftRotate (int a[], int n)
    {
        int temp = a[0];

        for (int i = 1; i < n; i++)
        {
            a[i - 1] = a[i];
            
        }
        a[n - 1] = temp; 
    }

    static void LeftRotateByD (int a[], int n, int d)
    {
        int temp [] = new int[d];

        for(int i = 0; i < d; i++)
        {
            temp[i] = a[i];
        }  

        for (int i = d; i < n; i++)
        {
            a[i - d] = a[i];
        }

        for (int i = 0; i < d; i++)
        {
            a[n - d + i] = temp[i];
        }
    }
}
