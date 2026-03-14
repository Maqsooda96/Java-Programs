import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator 
{
    public static void main(String[] args) 
    {
        final byte month_in_year = 12;
        final byte percentage = 100;

        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter the principal: ");
        int pl = sn.nextInt();

        System.out.print("Annual Interest Rate: ");
        float air = sn.nextFloat();

        float mi = air / percentage / month_in_year ;

        System.out.print("Periods (Years): ");
        byte years = sn.nextByte();

        int nop = years * month_in_year;

        double mortgage = pl *(mi* Math.pow(1 + mi, nop) ) / 
        (Math.pow(1+ mi, nop) - 1);

        String morgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Morgage: " +morgageFormatted);

    }

}
