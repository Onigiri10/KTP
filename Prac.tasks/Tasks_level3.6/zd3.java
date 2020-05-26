public class zd3 
{
    public static void main(String[] args)
    {
        System.out.println(checkPerfect(12));
    }
    public static boolean checkPerfect(int n) 
    {
        int sum = 0;

        for(int i = 1; i <= n/2; i++)
        {
            if (n%i == 0) 
                sum += i;
        }
        return n == sum;	
    }
}