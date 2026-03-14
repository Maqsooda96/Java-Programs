
import java.awt.Point;
import java.util.Arrays;
import java.util.Date;

public class Solution 
{
    public static void main(String[] args)
    {
        int x;
        int y;
        x=10;
        y=20;
        char l= 'A';
        byte z = 1;
        byte w = 2;
       
        Point p1 = new Point(1, 1); //A pointer is used for reference by storing the memory address of another variable, 
        Point p2 = p1;  //Pointer is used for reference
        p1.x=2;   //p1 and p2 reference the same memory location
        System.out.println(p2); //Any modification made through p2 is reflected when accessing the object via p1  
        p1.y= 8;
        System.out.println(p2);
    
        System.out.println(w);
        System.out.println(z);
        
        Date now = new Date();
        System.out.println(now);
        
        System.out.println(l);
        System.out.println(x);
        System.out.println(y);

        String msg= "Hello";
        System.out.println(msg);

        String msg1= "World";
        System.out.println(msg1);

        //String functions and methods
        System.out.println(msg + msg1);

        String msg2 = " Welcome to Java " + "World";
        System.out.println(msg2);
       
        System.out.println(msg2.endsWith("!!"));
        System.out.println(msg2.length());
        System.out.println(msg2.indexOf("o"));
        System.out.println(msg2.replace("a", "@"));
        System.out.println(msg2.toLowerCase());   
        System.out.println(msg2.trim());
        System.out.println(msg2); 
        
        // Variable Declaration
        int xx = 10;
        int yy = 20;
        
        System.out.println(xx);
        System.out.println(yy);

        String msg3 = "Hello \"World\" \"!!\"";
        System.out.println(msg3);

        String msg4 = "c:\n windows\\...";
        System.out.println(msg4);

        String msg5 = "c:\t windows\\...";
        System.out.println(msg5);

        //Arrays
        int[] nums = new int[6];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        String a = Arrays.toString(nums);
        System.out.println(a);
        
        // One-Dimesional Array
       // int nums1 = new  int[6];        
        int[] nums1 = {2,3,4,56,7,8};
        String b = Arrays.toString(nums1);
        System.out.println(b);
        System.out.println(nums1.length);
        
                      // Multi-dimensional Array
              //   ---------------------------------
        //Two-Dimensional Array    
        int [] [] num=  new int [2] [3];  //2 rows 3colomns
        num [0] [0] = 0;
        num [0] [1] = 1;
        num [0] [2] = 2;
        num [1] [0] = 3;
        num [1] [1] = 4;
        num [1] [2] = 5;
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.deepToString(num));

        int [] [] num2 = {{ 1, 2, 3}, { 4, 5, 6,}};
        System.out.println(num2); //Print array Index
        System.out.println(Arrays.deepToString(num2));

        //Three-Dimensional Array
        int [] [] [] num1 = new int [2] [3] [5]; //2 rows, 3 colomns and 5 elements in a single set 
        System.out.println(Arrays.deepToString(num1));
        num1 [0] [0] [0] = 0;
        num1 [0] [0] [1]= 1;
        num1 [0] [0] [2]= 2;
        num1 [1] [0] [0]= 3;
        num1 [1] [1] [0]= 4;
        num1 [1] [0] [1] = 5;
        
        //autoboxing and Unboxing (it happens when one data is object and other is primitive)
        int a1 = 10;
        Integer a2 = a1;  // Integer is equal to int  Autoboxing
        System.out.println(a2);
        Integer a3 = a2;   //Unboxing
        System.out.println(a3);

        int x1 = 400;
        int x2 = 400;

        if(x1==x2)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Different");
        }

        Integer y1 = 300;
        Integer y2 = 300;
        if(y1==y2)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Different");
        }

        System.out.println("Value is " + x1);  //showing how to print a value
        System.out.println("Value2 is " +y1);
        System.out.println("values are " + x1 + "," + x2 +"," + y1 +"," +y2);
        System.out.println();
        // Non-primitive types in Java offer a flexible way to manage complex data structures and objects. 
        // They allow for the representation of real-world entities using classes, and they are essential 
        // for object-oriented programming. By understanding their behavior, such as reference storage and 
        // heap allocation, you can effectively leverage them in your programs. 

          //constants
          final float  pi = 3.14f; 
     
          // Operations
       // --------------- 
        //Arithametic Expression
        int result = 10+2;
        System.out.println(result);
      
        double diff = (double)10-(double)2;
        System.out.println(diff);
      
        int mul = 10*2;
        System.out.println(mul);
      
        float di= 10/2;
        System.out.println(di);
        
        float mod= 10 % 2;
        System.out.println(mod);

        int zz= 11;
        System.out.println(zz);
        zz++;
        System.out.println(zz++);
         
        ++zz;
        System.out.println(++zz);
    }

    
}


