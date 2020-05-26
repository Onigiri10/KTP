public class zd3 
{
    public static void main(String[] args) 
    {
        System.out.println(canComplete("butl", "beautiful"));
    }
    public static boolean canComplete(String a, String b)
    {
        char[] chars = a.toCharArray();
        int k=0;

        for (int i = 0; i<chars.length;i++)
        {
            if (b.indexOf(String.valueOf(chars[i]),k) != -1)
                k = b.indexOf(String.valueOf(chars[i]),k) + 1;
            else 
                return false;
        }
        return true;
    }
}