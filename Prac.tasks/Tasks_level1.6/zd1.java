import java.util.Scanner;

public class zd1 
{
    public static void main(String args[])
	{
        System.out.println("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();

        int ostatok = remainder(a,b);

        System.out.println("Остаток от деления равен: " + ostatok);
    }
    public static int remainder(int a, int b) 
    /**Функция, которая возвращает остаток от деления*/    
    {
        return a % b;
    }
}
