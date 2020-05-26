import java.util.*;

public class zd6 
{
    public static void main(String[] args)
    {
        int[] mas1={2};
        int[] mas2={3,3,3,3};
        System.out.println(same(mas1,mas2));
    }
    public static boolean same(int[] mas1, int[] mas2)
    {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        for (int i=0;i<mas1.length;i++)
            map1.put(mas1[i],"");
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        for (int i=0;i<mas2.length;i++) 
            map2.put(mas2[i],"");

        return map1.size() == map2.size();
    }
}