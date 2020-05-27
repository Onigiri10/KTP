public class zd2 
{
    public static void main(String[] args) 
    {
        System.out.println(translateWord("flag"));
        System.out.println(translateSentence("I like to eat honey waffles."));
    }
    public static String translateWord (String str) 
    {
        if (str.isBlank())
            return str;
        if  (String.valueOf(str.charAt(0)).matches("[aeyuioAEYUIO]")) 
            return str + "yay";
        else 
        {
            while(!String.valueOf(str.charAt(0)).matches("[aeyuioAEYUIO]"))
            {
               String sym = str.substring(0, 1);
               str = str.substring(1) + sym.toLowerCase();
            }
            return str + "ay";
        }
    }
    public static String translateSentence (String str) 
    {	
        boolean flag = false;
        String res = "";
        String sym = "";
            
        if  (String.valueOf(str.charAt(str.length()-1)).matches("[.!?]")) 
        {
            sym = String.valueOf(str.charAt(str.length()-1));
            str = str.substring(0, str.length()-2);
        }
        String[] each = str.split(" ");
        for (String word : each) 
        {
            word = translateWord(word);
            if (!word.toLowerCase().equals(word)) 
            {
                word = word.toLowerCase();
                word = word.substring(0,1).toUpperCase() + word.substring(1);
            }
            if (flag) 
                word+=sym;
            res += word + " ";
        }
        return res;
    }
}