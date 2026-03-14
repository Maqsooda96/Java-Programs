import java.awt.Point;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class GeeksforGeeks 
{
    public static void main (String[] args)
    {
        int x;
        int y;
        x=10;
        y=20;
        char l= 'A';
        byte z = 1;
        byte w = 2;
       
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x=2;
        System.out.println(point2);
        point1.y= 8;
        System.out.println(point2);
    
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
        
       //Constants
        final float pi= 3.14F;   //use final data type to declare perticular variable value is same in complete programm
        
        int k= 3;
         System.out.println((k++) + " " +(k--));
        System.out.println((5^2^5)^2);

        int n = 1000000;
        System.out.println(n * (n+1)/2);

        int kl = 3;
        kl = +3;
        System.out.println(kl);
        System.out.println(null == null);

        int aa = 5;
         
        if((aa & 1) != 0)
        {
            System.out.println("odd");

        }
        else
        {
            System.out.println("Even");
        }

        int ab = -0;
        System.out.println(ab^1);

        System.out.println(~2);

        int arr[] = {1, 2};
        int arr1[] = {1,2};

        System.out.println(arr == arr1);
        System.out.println("C:\"\\xyz\\\"abc.txt");
        char ch = 'a';
        System.out.println(ch+1);

        Scanner sn = new Scanner(System.in);
        int number = sn.nextInt();

        switch(number)
        {
            case 1:
                System.out.println("One");
                break;
            
            case 2:
                System.out.println("Two");
                break;
            
            case 3:
                System.out.println("Two");
                break;
            
            case 4:
                System.out.println("Two");
                break;
                
            case 5:
                System.out.println("Five");
                break;
                
            case 6:
                System.out.println("Two");
                break;
                
            case 7:
                System.out.println("Two");
                break;
                
            case 8:
                System.out.println("Two");
                break;
        
            case 9:
                System.out.println("Two");
                break;
                
            case 10:
                System.out.println("Unknown");
                default:
        }
        
        String isLeap = "false";

        int year = sn.nextInt();

        if(year % 400 == 0)
        {
            System.out.println("True");
        }
        else if ( year % 100 == 0)
        {
            System.out.println("False");
        }
        else if( year % 4 == 0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }


        int aaa = sn.nextInt();
            int bbb = sn.nextInt();
            int operator = sn.nextInt();

        if(operator == 1)
        {
            System.out.println(aaa + bbb);
        }
        else if( operator == 2)
        {
            System.out.println(aaa - bbb);
        }
        else if( operator == 3)
        {
            System.out.println(aaa * bbb);
        }
        else
        {
            System.out.println("Invalid Input");
        }
            
        char chhh = 'a';
       switch(chhh)
        {
            case 97:
            System.out.println("First");
            break;

            default:
            System.out.println("Second");
        }

        char chh = 'a';
        if(chh =='a')
        {
            System.out.println("First");
        } 
        else if (ch - 97 + 1 == 1)
        {
            System.out.println("Second");
        }
        if (ch - 97 + 1 == 1)
        {
            System.out.println("Third");
        }
        }
    
    
}
