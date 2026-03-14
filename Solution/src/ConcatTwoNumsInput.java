import java.util.Scanner;

public class ConcatTwoNumsInput 
{
    public static void main(String[] args) 
    {
     
      Scanner sn= new Scanner(System.in);

      System.out.print("Enter the first number: ");
      int a = sn.nextInt();
      String a1 = String.valueOf(a); //when you need to convert a primitive data type or an object into its string representation. 
       
      System.out.print("Enter the first number: ");
      int b = sn.nextInt();
      String b1 = String.valueOf(b);

      String c = String.valueOf(a) + String.valueOf(b);
      System.out.println(c);
     
        
    }
        
            
}
