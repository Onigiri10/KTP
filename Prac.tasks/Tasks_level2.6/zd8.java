import java.util.Scanner;

public class zd8 
{
    public static void main(String args[])
	{
        
        System.out.println("Введите первое слово: ");
        Scanner in = new Scanner(System.in);
        String word1 = in.nextLine();

        System.out.println("Введите второе слово: ");
        String word2 = in.nextLine();

        System.out.println("Образуют ли данные слова странную пару?");
        System.out.println(isStrangePair(word1,word2));
        
    }
    public static boolean isStrangePair(String word1, String word2) 
    /** Функция, которая проверяет являются ли данные слова странной парой:
     * Первая буква 1 строки = последней букве 2 строки
     * Последняя буква 1 строки = первой букве 2 строки */    
    {   
        boolean flag = false;
        if (word1.charAt(0) == word2.charAt((word2.length()-1)))
            return true;
        else if (word2.charAt(0) == word1.charAt((word1.length()-1)))
            return true;
        return flag;
    }
}