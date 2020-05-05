import java.util.Scanner;

public class zd8 
{
    public static void main(String args[])
	{
        System.out.println("Введите длину 1 стороны треугольника: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите длину 2 стороны треугольника: ");
        int b = in.nextInt();

        System.out.println("Длина 3 стороны: ");
        System.out.println(nextEdge(a,b));
        
    }
    public static int nextEdge(int a, int b) 
    /** Функция, которая находит максимальное значение 
     * третьего ребра треугольника */    
    {   
        return a + b - 1;
    }
}