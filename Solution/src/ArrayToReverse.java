import java.util.Scanner;

public class ArrayToReverse 
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
        
        ReverseArrayelements(a, n);
        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        sn.close();
    }

    static void ReverseArrayelements (int a[], int n)
    {
        int low = 0;
        int high = n - 1;
       
        while (low < high)
        {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--; 
        }
    }
}
