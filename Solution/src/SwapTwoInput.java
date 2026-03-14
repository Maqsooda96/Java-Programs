import java.util.Scanner;

public class SwapTwoInput 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sn.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = sn.nextInt();

        int temp = 0;
        temp = a; 
        a = b;
        b = temp;
        System.out.println("After Swapping the numbers, a = " + a + " and b= " +b);
    }

}
