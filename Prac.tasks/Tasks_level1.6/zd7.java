import java.util.Scanner;

public class zd7 
{
    public static void main(String args[])
	{
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println("Сумма равна: ");
        System.out.println(addUpTo(number));
        
    }
    public static int addUpTo(int number) 
    /** Функция, которая берет последнее число из последовательного 
     * списка чисел и возвращает сумму всех чисел до него и включая его */    
    {   
        int Sum = 0;
        for (int i = 0; i <= number; i++)
            Sum += i;
        return Sum;
    }
}