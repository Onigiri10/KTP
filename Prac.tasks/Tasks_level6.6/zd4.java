import java.util.*;

public class zd4 
{
    public static void main(String[] args) 
    {
		String[] b = {"b"};
    	System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2",b));
	}
    public static String stripUrlParams(String url, String ...param) 
    {
        String res = "", args = "";
        Map<String, String> map = new HashMap<>();
        String[] wp = url.split("\\?");
        res += wp[0];
        if (wp.length!=1) 
        {
            wp = wp[1].split("&");
            for (int i = 0; i<wp.length; i++) 
            {
                String[] pair = wp[i].split("=");
                if (map.containsKey(pair[0])) 
                {
                    map.replace(pair[0], pair[1]);
                } 
                else map.put(pair[0], pair[1]);
            }
            res += "?";
        }
        for (String pam : param) 
        {
            if (map.containsKey(pam)) map.remove(pam);
        }
        for (String key : map.keySet()) 
        {
            res += key + "=" + map.get(key) + "&";
        }
        return res.substring(0,res.length()-1);
    }
}