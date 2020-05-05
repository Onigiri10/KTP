import java.util.Scanner;

public class zd7 
{
    public static void main(String args[])
	{
        
        System.out.println("Введите почтовый индекс: ");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        
        System.out.println("Дейтвителен ли почтовый индекс? ");
        System.out.println(isValid(stroka));
    }

    public static boolean isValid(String stroka) 
    /** Функция, которая проверяет действителем ли введенный индекс */    
    {   
        char c = 32;
        boolean flag = true;
        if (stroka.length() <= 5)
        {
            for (int i = 0; i < stroka.length(); i++) 
            {
                if(stroka.charAt(i) >= '0' && stroka.charAt(i) <= '9') // наличие цифр
                {
                    if (stroka.charAt(i) != c)
                    {
                      flag = true;
                    }
                    else 
                    {
                        return false;
                    }
                }
                else 
                {
                    return false;
                }
            }
        }
        else 
        {
            return false;
        }
        return flag;
    }
}