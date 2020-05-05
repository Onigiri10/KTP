import java.util.Scanner;

public class zd9 
{
    public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        int[] mas;
        System.out.println("Введите количество элементов массива: ");
        int n = in.nextInt();
        if (n == 0)
            mas = new int[0];
        else
        {   System.out.println("Введите массив чисел: ");
            mas = new int[n]; // создаем  массив размером n
            for (int i = 0; i < mas.length; i++) 
                mas[i] = in.nextInt(); // заполняем массив с клавиатуры
        }
        System.out.println(sumOfCubes(mas));
    }
    public static int sumOfCubes(int mas[]) 
    /** Функция, которая принимает массив чисел и возвращает 
     * сумму его кубов */    
    {   
        int Sum = 0;

        for (int i = 0; i < mas.length; i++)
            Sum += Math.pow(mas[i],3);
        return Sum;
    }
}
