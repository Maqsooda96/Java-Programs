public class Stringbuffer 
{
    public static void main(String[] args) 
    {
        String s1 = "Geeks";
        String s2 = s1;
        s1 = s1 + "forGeeks";
        System.out.println(s1);

        if( s1 == s2)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }

        StringBuilder sb1 = new StringBuilder("Geeks");
        StringBuilder sb2 = sb1;

        sb1 = sb1.append("forGeeks"); // adding 2 strings using string builder
        
        System.out.println(sb1.reverse());
        System.out.println(sb1.delete(2, 4));
        System.out.println(sb1.insert(5, "q"));
        sb1.setCharAt(3, 'z');
        System.out.println(sb1);
        
        if(sb1 == sb2)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not same");
        }
        
    }
}
