public class ComparisonOperator 
{
    public static void main(String[] args)
    {
System.out.println(args.length);

       int x = 1;
       int y = 1;

       //Comparison Operators
       System.out.println(x==y); 
       System.out.println(x!=y);
       System.out.println(x<=y);
       System.out.println(x>=y);

       //Logical Operators
       int temperature = 22;
       boolean warm = temperature > 20 && temperature < 30; //both conditions true
       System.out.println(warm);

       boolean hasHighIncome = true;
       boolean hasGoodCredit = false;
       boolean hasCriminalRecords = false;
       boolean isEligible = (hasHighIncome || hasGoodCredit) && hasCriminalRecords; // false
       System.out.println(isEligible);
       boolean iisEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecords; //adding ! operator, it will reverse the value of hasCriminalRecords. So the answer will be true.
       System.out.println(iisEligible);

        int a= 3;
        if(a++ > 3 || a==4)
        {
            System.out.println("GFG");
        }
        else
        {
            System.out.println("Hi");
        }


        int number = 100;
        if (number % 2 == 0) 
        {
            System.out.println("First");
        }
        else if (number % 4 == 0) 
        {
            System.out.print("Second");
        }
        if (number % 5 == 0) 
        {
            System.out.println("Third");
        }
        else 
        {
            System.out.println("Fourth");
        }
         System.out.println();
       }

       
    }


