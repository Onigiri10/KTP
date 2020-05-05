import java.util.Scanner;

public class zd5 
{
    public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String number = in.nextLine();

        System.out.println("Число знаков после запятой: ");
        System.out.println(getDecimalPlaces(number));
        
    }
    public static int getDecimalPlaces(String number) 
    /** Функция, которая возвращает число десятичных знаков, 
     * которое имеет число */    
    {   
        double x = Double.valueOf(number);
        
        if (x % 1 == 0)
            return 0;
        else
            return number.split("\\.")[1].length();
    } 
}