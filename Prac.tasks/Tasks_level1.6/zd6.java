import java.io.*;

public class zd6 
{
    public static void main(String args[]) throws IOException
	{
        System.out.println("Введите символ: ");
        int x = System.in.read();
        char letter = (char) x;

        System.out.println("Значение по таблице ASCII:");
        System.out.println(ctoa(letter));
        
    }
    public static int ctoa(char letter) 
    /** Функция, которая возвращает значение ASCII переданного символа */    
    {   
        return (int) letter;
    }
}