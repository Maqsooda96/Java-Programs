import java.util.Scanner;

public class SwitchStatement 
{
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the role : ");
        String rl = sn.nextLine();

        if(rl == "admin")
        {
            System.out.println("Your are the ADMIN of the System congratulations...!!!");
        }
        else if(rl == "moderator")
        {
            System.out.println("You are a Moderator..!!");
        }
        else if(rl == "user")
        {
            System.out.println("You are a user of the System...!!!");
        }
        else
        {
            System.out.println("You are in the Guest mode...!!!!");
        }
    }

}
