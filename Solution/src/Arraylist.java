import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sn.nextInt();
        
        //initialization
        ArrayList<Integer> al = new ArrayList<>(n);
       
        //get elements from the user
        for (int i = 0; i < n; i++)
        {
            al.add(sn.nextInt());
            
        }
        //print elements
        for(int i = 0; i < al.size(); i++)
        {
            System.out.print(al.get(i) + " ");
        }
        sn.close();
    }
}
