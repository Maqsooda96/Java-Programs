import java.text.NumberFormat;
import java.util.Scanner;

public class Operators 
{
    public static void main(String[] args)
    {
        int x=10;
        int z=x++;  //z=10 save in memo first then z=11
        int y=++x;  //y=12  because final value of z is 11 
        System.out.println(y);
        System.out.println(z);
        System.out.println(x);

        ++x;
        System.out.println(x);

        ++x;
        System.out.println(x);

        x++;
        System.out.println(x);

        x = x + 2; // 15+2= 17
        System.out.println(x); // 17
        
        x += 2; // 17+2= 19
        System.out.println(x);

        x -= 2; // +=, -= and /= are augment operators
        System.out.println(x);

        int a = 10 + 3 * 2;
        System.out.println(a); //16

        // casting
        //implicit casting (Automatic casting)
        // byte > short > int > long > float > double
        int aa = 10;
        y= aa + 2; // value of aa putting directly to solve the eqtn.
        System.out.println(y);
        String xx= "1"; 
        int i= Integer.parseInt(xx); // converting string to Integer (Premitive data type will change. it depends on data type)
        int yy = i + 2;
        System.out.println(yy);
        System.out.println(xx);

        // Math class
        int f = Math.round(1.1F);      // this method using floating or double numbers to convert whole numbers
        System.out.println(f);

        long db = Math.round(2.4d);
        System.out.println(db);

        int cl = (int)Math.ceil(8.4F);  // explicitly cast the integer (int)
        System.out.println(cl);

        int fr= (int)Math.floor(5.8d);  // smaller or equal to this number
        System.out.println(fr);

        int mx = Math.max(2,8 ); // max from two numbers
        System.out.println(mx);

        int mn = Math.min(8, 2);
        System.out.println(mn);

        double rd = Math.random(); // random is double. so the result will be double
        System.out.println(rd); // each time running the program, will get different number,  floating point number 0 to 1.

        double rd1 = Math.random() +300;  
        System.out.println(rd1);  
    
        int rd2 = (int) (Math.random() * 100);  //random number between 0 to 100
        System.out.println(rd2);    

        //Formatting  Numbers
                // it cannot create new class because it is abstract class. it is like half cooked cake
                // it is used to format the numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String nf = currency.format(1234566.66777);    
        System.out.println(nf);

        NumberFormat pr = NumberFormat.getPercentInstance();
        String pr1 = pr.format(16.6);    
        System.out.println(pr1);

        //Reading Input 
        Scanner sc = new Scanner(System.in); // it is used to read the input value from user. (System.in) is used specify where the datas from to read. (System.out) is used to print under the terminal
        
        System.out.print("My name is ");
        String name = sc.nextLine(). trim();  //nextLine() is used to print the whole line . if next() is only print one word. trim() is used to remove white space from the string
        
       
        System.out.print("Age : ");
        byte age = sc.nextByte();  //scan the data type depends on data types
        
        System.out.println("My name is " +name);
        System.out.println("My age is " + age + " years old"); // concat string and int
        
        int xa = 100;
        long la = x;
        float za= la;

        System.out.println(x);
        System.out.println(la);
        System.out.println(za);

        
    }                                           
}
