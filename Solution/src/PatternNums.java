import java.util.Scanner;

public class PatternNums 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square wall:");
        int S = sc.nextInt();
        sc.close();

        printSquareWall(S);
    }

    public static void printSquareWall(int S) {
        System.out.println(" * ".repeat(S * S));
    }

}
