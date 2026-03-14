import java.util.Scanner;

public class tempctof 
{
    public static void main(String[] args) 
    {   
        Scanner sn = new Scanner(System.in);
        int c = sn.nextInt();
        double f =((double) (c) * (9.0 / 5.0)) + 32; 
        System.out.println(f);    
    }   
}
