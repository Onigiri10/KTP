import java.util.*;

public class zd10 
{
    public static void main(String[] args)
    {
        System.out.println(palindromeDescendant(13001120));
    }
    public static boolean palindromeDescendant(int numb) 
    {
        String num = Integer.toString(numb);
        String rev_num = "";

        for (int i = 0; i < num.length(); i++) 
            rev_num += num.charAt(i);
        for (int i = 0; num.length() >= 2; i++)
        {
            if (num.equals(rev_num)) 
                return true;
            num = "";

            for (int y = rev_num.length() - 1; y > 0; y -= 2) 
                num += Character.getNumericValue(rev_num.charAt(y)) + Character.getNumericValue(rev_num.charAt(y - 1));
            rev_num = "";

            for(int x = 0; x < num.length(); x++) 
                rev_num += num.charAt(x);
        }
        return false;
    }
}