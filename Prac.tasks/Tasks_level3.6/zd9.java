import java.util.Scanner;

public class zd9 
{
    public static void main(String args[])
    {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int chislo = in.nextInt();

        System.out.println("Простое число: ");
        if (nextPrimes(chislo))
            System.out.println(chislo);
        else
        {
            while (!nextPrimes(chislo))
            {
                chislo += 1;
            }
            System.out.println(chislo);
        }
        
    }
    public static Boolean nextPrimes(int chislo) 
    /*Функция, опряделяющая, является ли введенное число простым*/    
    {
        for (int i = 2; i < chislo; i++)
        {
            if ((chislo%i == 0) && (chislo != i))
            {
                return false;              
            }
        }
        return true;
    }
}