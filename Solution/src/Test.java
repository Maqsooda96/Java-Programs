import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) { 
      int xa = 100;
      long la = xa;
      float za= la;

      System.out.println(xa);
      System.out.println(la);
      System.out.println(za);

      //Type Conversion
      //Narrow or Explicit conversion:
      //conversion will happens, byte to long but long to byte is problem. 
      //long has larger value s as compared to bytes. it may cause loss of data. 
      
    //  double d = 65.4;
     // int i = (int)d; // convert double to int
  //    char c = (char)i; // convert int to char , explicit conversion
  //    System.out.println(i);  //65
  //    System.out.println(c); // A , 65 is Asci value of A
      
      double d = 10.23;

      System.out.println("Input: d = " + d);

        // Typecast double to integer
        int integerValue = (int) d;

        System.out.println("Output: " + integerValue);

      //  String s= "MAQSOODA";
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      String s = sc.nextLine();
      sc.close();

      // Convert string to lowercase
      String lowerCaseString = s.toLowerCase();

      System.out.println("Lowercase string: " + lowerCaseString);

    } 

    static String toLower(String s) 
    {
        // code here
        String result = s.toLowerCase();
        return result;
    }
    
    
    
       
    

    
    

}
