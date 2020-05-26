import java.util.Scanner;

public class zd8 
{
    public static void main(String args[])
    {
        System.out.println("Введите двоичную строку: ");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();

        System.out.println("Самая длинная последовательность нулей: ");
        System.out.println(longestZero(stroka));
        
    }
    public static String longestZero(String stroka) 
    /** Функция, которая возвращает самую длинную последовательность 
     * последовательных нулей в двоичной строке */    
    {   
        String num_zero = "";
        int max = 0;
        int count = 0;
        if (stroka.indexOf('0') == -1)
            return num_zero;
        else
            {
                for (int i = 0; i < stroka.length(); i++)
                {
                    if (stroka.charAt(i) == '0')
                        count++;
                    else
                    {
                        if (count >= max)
                        {
                            max = count;
                            count = 0;
                        }
                    }
                }
                if (count > max)
                    max = count;
            }
        for (int i = 0; i < max; i++)
            num_zero += '0';
        return num_zero;
    }
}