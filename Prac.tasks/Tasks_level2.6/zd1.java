import java.util.Scanner;

public class zd1 
{
    public static void main(String args[])
    {
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        System.out.println("Введите количество повторов: ");
        int n = in.nextInt();

        System.out.println("Результирующая строка: ");
        System.out.println(repeat(stroka,n));
        
    }
    public static String repeat(String stroka, int n) 
    /** Функция, которая которая повторяет каждый символ в строке n раз */    
    {   
        String rez = ""; 
        int k = 0; //счетчик

        for (int i = 0; i < stroka.length(); i++)
        {
            while (k < n)
            {
                rez += stroka.charAt(i);
                k++;
            }
            k = 0;  
        }
        return rez;
    }
}
