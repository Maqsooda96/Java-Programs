import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reversestriing {
    
    // Function to reverse a string
    public static String reverseString(String s) {
        StringBuilder rs = new StringBuilder(s);
     //   String ss = rs.reverse().toString();
        return rs.reverse().toString();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine()); // Read number of test cases

        while (t-- > 0) {
            String s = read.readLine().trim(); // Read input string
            System.out.println(reverseString(s)); // Print reversed string
            System.out.println("~");
        }
    }
}
