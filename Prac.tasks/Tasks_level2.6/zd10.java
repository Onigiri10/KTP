import java.util.Scanner;

public class zd10 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите шаг: ");
        int n = in.nextInt();

        System.out.println("Количество полей: ");
        System.out.println(boxSeq(n));
        
    }
    public static int boxSeq(int n) 
    /** Функция, которая принимает число (шаг) в качестве аргумента и 
     * возвращает количество полей на этом шаге последовательности */    
    {
        if (n % 2 == 0)
            return n;
        else    
            return n + 2;
    }
}


