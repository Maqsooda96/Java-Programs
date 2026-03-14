import java.util.Scanner;

public class IfStatement 
{
    public static void main (String[] args)
    {
        //if Statements
    //   int temp = 32;

        Scanner sn= new Scanner(System.in);
        
        System.out.print("Enter the Today's temperature of your location");
        int temp = sn.nextInt();

        if(temp > 30)
        {
            System.out.println("Its hot day \nDrink plenty of water");
        }
        else if(temp > 20)
        {       // in elseif and else statement will work with or without {}
            System.out.println("Its nice day");
        }
        else
        {
            System.out.println("Its cold");
        }

        //Simplifying if statement

     //   int income = 120_000; //120,000
        boolean hasHighIncome = false;
        boolean hasLowerIncome = true;

        System.out.print("Enter your current CTC : ");
        int income = sn.nextInt();

        if( income < 200_000 && hasLowerIncome)
        {
            System.out.println("You are Eligible for this Job..!!");
        }
        else
        System.out.println("You have to Apply for the next level Job...!!!");
        
        //Ternary  Operator

        int salary = 200_00;
        String className = salary > 100_000 ? "First" : "Second";
                         //condition          //value if the condition is true
        
        
String s = sn.next();


    }

}
