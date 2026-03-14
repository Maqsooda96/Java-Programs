import java.util.Scanner;
public class Excer 
 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int s = scanner.nextInt();
    
            for (int i = 1; i <= s; i++) 
            {
                if (i == 1) 
                {
                    System.out.println("* ");
                } 
                else if (i == s) 
                {
                    for (int j = 0; j < s; j++) 
                    {
                        System.out.print("* ");
                    }
                    System.out.println(); // Newline after the base
                } 
                else 
                {
                    System.out.print("* ");
                    for (int j = 0; j < i - 2; j++) 
     
                    {
                        System.out.print("  "); // Two spaces as per the prompt
                    }
                    System.out.println("*");
                }
            }
            scanner.close();
        }
    }




