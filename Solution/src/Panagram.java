import java.util.Scanner;

class Panagram 
{
    
    static boolean isPanagram(String s)
    {   
        

        int n = s.length();
        
        if(n < 26)
            return false;
        
        boolean visited[] = new boolean[26];
        
        for(int i=0; i<n; i++)
        {
            char x = s.charAt(i);
            
            if(x >= 'a' && x <='z')
            {
                visited[x-'a'] = true;
            }
            
            if(x >= 'A' && x <='Z')
            {
                visited[x-'A'] = true;
            }
        }
        
        for(int i =0; i<26; i++)
        {
            if(visited[i] == false)
                return false;
        }
        
        return true;
    }
    
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sn.nextLine();
        
        System.out.println(isPanagram(s));
    }
}