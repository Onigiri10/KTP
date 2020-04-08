public class Primes 
{
    public static void main(String[] args)
    {
        for (int i = 2; i < 101; i++)
        {
            if (isPrime(i) == true)
            {
                System.out.println(i);
            }
        }
    }
    public static Boolean isPrime(int n) 
    /*Функция, опряделяющая, является ли введенное число простым*/    
    {
        for (int i = 2; i < n; i++)
        {
            if ((n%i == 0) && (n != i))
            {
                return false;              
            }
        }
        return true;
    }
}