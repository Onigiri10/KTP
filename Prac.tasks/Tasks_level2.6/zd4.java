import java.util.Scanner;

public class zd4 
{
    public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = in.nextInt();
        int[] mas = new int[n]; 
        int[] rez_mas = new int[n];

        System.out.println("Введите массив чисел: ");
        for (int i = 0; i < mas.length; i++) 
            mas[i] = in.nextInt();

        System.out.println("Результирующий массив: ");
        rez_mas = cumulativeSum(mas);
        for (int i = 0; i < rez_mas.length; i++)
        {
            if (i != rez_mas.length - 1)
                System.out.print(rez_mas[i] + ", ");
            else
                System.out.print(rez_mas[i]);
        }
    }
    public static int[] cumulativeSum(int mas[]) 
    /** Функция, которая берет массив целых чисел и возвращает массив, 
     * в котором каждое целое число является суммой самого себя + всех 
     * предыдущих чисел в массиве */    
    {   
        int j = 0;
        int[] rez_mas = new int[mas.length];
        rez_mas[0] = mas[0]; 

        for (int i = 1; i < mas.length; i++)
        {
            rez_mas[i] = rez_mas[j] + mas[i];
            j++;
        }
        return rez_mas;
    }
}