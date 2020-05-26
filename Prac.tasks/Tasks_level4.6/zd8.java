public class zd8 
{
    public static void main(String[] args) 
    {
		System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
	}
    public static boolean doesRhyme(String str1, String str2)
    {
        str1 = str1.substring(str1.lastIndexOf(" ")).toLowerCase();
        str2 = str2.substring(str2.lastIndexOf(" ")).toLowerCase();

        for (int i = 0; i < str1.length(); i++)
        {
            if (String.valueOf(str1.charAt(i)).matches("[aeyuio]"))
                if (!str2.contains(String.valueOf(str1.charAt(i)))) 
                    return false;
        }
        for (int i=0;i<str2.length();i++)
        {
            if (String.valueOf(str2.charAt(i)).matches("[aeyuio]"))
                if (!str1.contains(String.valueOf(str2.charAt(i)))) 
                    return false;
        }
        return true;
    }
}