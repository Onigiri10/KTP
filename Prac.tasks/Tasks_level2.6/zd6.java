import java.util.Scanner;

public class zd6 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb = in.nextInt();

        System.out.println("Число Фибоначчи: ");
        System.out.println(Fibonacci(numb));
        
    }
    public static int Fibonacci(int numb) 
    /** Функция, которая при заданном числе возвращает 
     * соответствующее число Фибоначчи */    
    {
        if (numb == 1 || numb == 2)
            return 1;
        else
        {
            int x = 1;
            int y = 1;
	        for (int i = 0; i < numb; i++)
	        {
		        x += y;
		        y = x - y;
	        }
	        return y;
        }
         
    }
}
