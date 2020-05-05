import java.util.Scanner;

public class zd9 
{
    public static void main(String args[])
	{
        
        System.out.println("Введите слово: ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        System.out.println("Введите суффикс или префикс: ");
        String word2 = in.nextLine();

        System.out.println(" ");
        if (word2.charAt(0) == '-')
        {
            System.out.println(isSuffix(word,word2));
        }
        else
            System.out.println(isPrefix(word,word2));
        
    }
    public static boolean isPrefix(String word, String prefix) 
    /** Функция, которая проверяет начинается ли слово с префиксного аргумента */    
    {   
        boolean flag = true;
        String sub_str = prefix.substring(0,prefix.length()-2);
        for (int i = 0; i < sub_str.length(); i++)
            if (sub_str.charAt(i) != word.charAt(i))
            {
                return false;
            }
        return flag;
    }
    public static boolean isSuffix(String word, String suffix) 
    /** Функция, которая проверяет заканчивается ли слово аргументом суффикса */    
    {   
        
        boolean flag = true;
        String sub_str = suffix.substring(1,suffix.length());
        int j = sub_str.length()-1;
        for (int i = word.length()-1; i > sub_str.length(); i--)
        {
            if (j < 0)
                return flag;
            if (sub_str.charAt(j) != word.charAt(i))
            {
                return false;
            }
            j--;
        }
        return flag;
    }
}