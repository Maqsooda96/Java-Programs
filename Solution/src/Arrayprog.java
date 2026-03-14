import java.util.Scanner;
public class Arrayprog 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = sn.nextInt();
        int [] a = new int[n]; 
        System.out.print("Enter the "+ n + "number of array elements:"); 
        for (int i = 0; i < a.length; i++)
        {   
            a[i] = sn.nextInt();  //array elements from the user inputs. a[] is declared above
            
        } 
        for (int i = 0; i < a.length; i++) 
        {
             System.out.print(a[i] + " ");
        }
       
        sn.close(); 
    }
}
