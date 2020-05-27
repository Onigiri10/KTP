import java.util.*;

public class zd3 
{
    public static void main(String[] args) 
    {
        System.out.println(validColor("rgb(0,,0)") );
    }
    public static boolean validColor(String str) 
    {
        String[] wp = str.substring(str.indexOf('(')+1, str.indexOf(')')).split(",");
        if (str.contains("rgba") && wp.length != 4 || (str.contains(",,"))) 
            return false;
        for (int i = 0; i < wp.length ; i++) 
        {
            double num = Double.parseDouble(wp[i]);
            if (i==3) 
            {
                if (!(num >= 0 && num <= 1.0)) 
                    return false;
            }
            else if (!(num >= 0 && num <= 255)) 
                return false;
        }
        return true;
    }
}