import java.util.Scanner;

public class zd3 
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
        System.out.println("Является ли среднее значение элементов целым числом? ");
        System.out.println(isAvgWhole(mas));
    }
    public static Boolean isAvgWhole(int mas[]) 
    /** Функция, принимает массив в качестве аргумента и возвращает true или false 
     * в зависимости от того, является ли среднее значение всех 
     * элементов массива целым числом или нет */    
    {   
        Boolean flag = false;
        int Sum = 0;
    
        for (int i = 0; i < mas.length; i++)
        {
            Sum += mas[i];
        }
        if (Sum % mas.length == 0)
            flag = true;
            
        return flag;
    }
}