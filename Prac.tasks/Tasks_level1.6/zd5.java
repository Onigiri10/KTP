import java.util.Scanner;
public class zd5 
{
    public static void main(String args[])
	{
        
        System.out.println("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println("Введите второе число: ");
        int a = in.nextInt();
        System.out.println("Введите третье число: ");
        int b = in.nextInt();

        System.out.println(operation(N, a, b));
    }
    public static String operation(int N, int a, int b) 
    /** Функция, которая вычисляет, что нужно сделать с 2 числами , 
     * чтобы получить третье*/    
    {   
        String rez = "";
        if ((N - a) == b)
            rez = "added";
        else if (a - b == N) 
            rez = "subtracted";
        else if (a * b == N)
            rez = "prodact";  
        else if (a / b == N)
            rez = "division";
        else 
            rez = "none";
        return rez;
    }
}