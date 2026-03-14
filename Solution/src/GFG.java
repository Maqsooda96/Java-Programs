
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Solution oj = new Solution();
            oj.Swap(a, b);

            System.out.println("a" +a+"b" +b);
        }
    }
}
