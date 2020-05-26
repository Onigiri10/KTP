public class zd7 
{
    public static void main(String[] args) 
    {
		System.out.println(toStarShorthand("77777geff"));
    }
    public static String toStarShorthand(String str)
    {
        if (str.isEmpty()) 
            return "";
        int j = 1;
        char c = str.charAt(0);
        String text = "";

        for (int i = 1; i < str.length(); i++)
        {
            if (str.charAt(i) == c) 
                j++;
            else 
            {
                if (j >1 )
                    text += c + "*"+j;
                else
                    text += c;
                c = str.charAt(i);
                j = 1;
            }
        }
        if (j>1) 
            text += c + "*" + j;
        else 
            text += c;

        return text;
    }
}