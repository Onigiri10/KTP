import java.util.Scanner;

public class zd3 
{
    public static void main(String args[])
	{
        System.out.println("Введите количество курочек: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите количество коров: ");
        int b = in.nextInt();
        System.out.println("Введите количество свинок: ");
        int c = in.nextInt();

        int Itog = animals(a,b,c);

        System.out.println("Итого всего ног животных: " + Itog);

    }
    public static int animals(int a, int b, int c)
    /** Функция, которая возвращает общее количество ног всех животных*/    
    {
        return 2*a + 4*b + 4*c;
    }
}