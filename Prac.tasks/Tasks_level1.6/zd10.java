import java.util.Scanner;

public class zd10 
{
    public static void main(String args[])
	{
        System.out.println("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        System.out.println("Введите третье число: ");
        int c = in.nextInt();

        System.out.println("Выполняются ли условия задачи? ");
        System.out.println(abcmath(a, b, c));
        
    }
    public static Boolean abcmath(int a, int b, int c) 
    /** Функция, которая добавляет A к себе B раз
     * и проверяет, делится ли результат на C */    
    {   
        Boolean flag = false;
        int Sum = a;

        for (int i=0; i < b; i++)
            Sum = 2 * Sum;
        if (Sum % c == 0)
            flag = true;

        return flag;
    }
}