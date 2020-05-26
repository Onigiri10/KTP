public class zd4 
{
    public static void main(String[] args) 
    {
        System.out.println(sumDigProd(16, 28));
    }
    public static int sumDigProd(int... number){
        int rez = 0;
        for (int i : number)
        {
            rez += i;
        }
        int mul = rez;
        while (mul > 9)
        {
            mul = 1;
            do 
            {
                mul *= rez % 10;
                rez = rez / 10;
            }
            while (rez != 0);
            rez = mul;
        }
        return rez;
    }
}