import java.util.Scanner;

public class ArithmaticOperators 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter the First number: ");
        int a= sn.nextInt();

        System.out.print("Enter the second number: ");
        int b= sn.nextInt();

        int sum = a+b;
        System.out.println("Sum of the two numbers: " +sum);

        int diff = a-b;
        System.out.println("Difference of the two numbers: " +diff);

        int mul = a*b;
        System.out.println("Product of the two numbers: " +mul);

        float div = a/b;
        System.out.println("Division of the two numbers: " +div);

        float mod = a%b;
        System.out.println("Modulus of the two numbers: " +mod);
    }

}
