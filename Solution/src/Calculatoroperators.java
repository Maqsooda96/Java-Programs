import java.util.Scanner;

public class Calculatoroperators 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int a = sn.nextInt();
        int b = sn.nextInt();
        sn.nextLine();

        Calculator(a, b);
        
        System.out.println("Enter the operator to get product (+, -, *, /, %)");
        String op = sn.nextLine();
       
        Calculatorswitch(a, b, op);
        
        sn.close();
    }

    public static void Calculator (int a, int b)
    {
        System.out.println(a + b);
        System.out.println(a - b);
        
        float c = (float)a; 
        float d = (float)b;
        
        System.out.println(a * b);
        System.out.println(c / d);
        System.out.println(c % d);
    }

    public static void Calculatorswitch (int a, int b, String op)
    {   
        float c = (float)a;  // simplified method for coverting int to float values, simple type casting
        float d = (float)b;
        
        switch (op)
        {
            case "+":
            System.out.println(a + b);
            break;

            case "-":
            System.out.println(a - b);
            break;

            case "*":
            System.out.println(a * b);
            break;
            
            case "/":
            System.out.println(c / d);
            break;

            case "%":
            System.out.println(c % d);
            break;
            
            default:
            System.out.println("Invalid Opearator");

        }
    }
}
