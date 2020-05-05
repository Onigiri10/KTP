import java.util.Scanner;

public class zd2 
{
    public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = in.nextInt();
        int[] mas = new int[n]; 
        System.out.println("Введите массив чисел: ");
        for (int i = 0; i < mas.length; i++) 
            mas[i] = in.nextInt();
        System.out.println("Разница между MAX и MIN: ");
        System.out.println(differenceMaxMin(mas));
    }
    public static int differenceMaxMin(int mas[]) 
    /** Функция, которая принимает массив и возвращает разницу между 
     * самыми большими и самыми маленькими числами */    
    {   
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] < min)
                min = mas[i];
            if (mas[i] > max)
                max = mas[i];
        }
        int dif = max - min; // разница между min и max
        return dif;
    }
}