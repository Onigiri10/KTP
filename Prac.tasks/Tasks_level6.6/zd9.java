import java.util.*;

public class zd9 
{
    public static void main(String[] args)
    {
        System.out.println(formula("6 * 4 = 24"));
    }
    private static boolean formula(String str)
    {
        int size = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ') 
                size++;
        }
        String mas[] = new String[size+1];
        Arrays.fill(mas,"");
        size = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ') 
                size++;
            else 
                mas[size] += str.charAt(i);
        }
        if (size > 4 || !(mas[3].equals("="))) 
            return false;
        try 
        {
            int mas1 = Integer.parseInt(mas[0]);
            int mas2 = Integer.parseInt(mas[2]);
            int mas3 = Integer.parseInt(mas[4]);
            if (mas[1].equals("+")) 
                return (mas1 + mas2) == mas3;
            else if (mas[1].equals("-")) 
                return (mas1 - mas2) == mas3;
            else if (mas[1].equals("*")) 
                return (mas1 * mas2) == mas3;
            else if (mas[1].equals("/")) 
                return (mas1 / mas2) == mas3;
            else return false;
        } 
        catch (Throwable e)
        {
            return false;
        }
    }
}