import java.util.Scanner;

public class zd2 
{
    public static void main(String args[])
	{
        System.out.println("Введите основание треугольника: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите высоту треугольника: ");
        int b = in.nextInt();

        double S = triArea(a,b);

        System.out.println("Площадь треугольника равна: " + S);

    }
    public static double triArea(int a, int b) 
    /** Функция, которая высчитывает площадь треугольника */    
    {
        return 0.5 * a * b;
    }
}