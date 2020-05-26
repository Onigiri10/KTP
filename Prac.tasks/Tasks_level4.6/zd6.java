public class zd6 
{
    public static void main(String[] args)
    {
        System.out.println(bugger(4));
    }
    public static int bugger(int num)
    {
        int i = 0;
        int mul = num;
        while(mul > 9)
        {
            mul = 1;
            do
            {
                mul *= num % 10;
                num = num / 10;
            }
            while (num!=0);
            num = mul;
            i++;
        }
        return i;
    }
}