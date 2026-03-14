import java.util.Scanner;

public class Asymptotic 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner (System.in);     
        System.out.print("Enter the number : ");
        int n = sn.nextInt();
        int[] ar = new int[n]; 
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++)
        {
             ar[i] = sn.nextInt();
        }
        
        getsum(ar, n);
       
        sn.close();
    }
    public static void getsum (int ar[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + ar[i];
        }
        System.out.println(sum);
    }
}
