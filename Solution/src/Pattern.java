import java.util.Scanner;

public class Pattern {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square wall:");
        int S = sc.nextInt();
        sc.close();

        printSquareWall(S);
    }

    public static void printSquareWall(int S) {
       // String row = " * ".repeat(S);
        for (int i = 0; i < S; i++) {
        //    System.out.println(row);
        }
        System.out.println();
    }

}
