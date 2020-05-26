public class zd6 
{
    public static void main(String[] args) 
    {
        System.out.println(validateCard(1234567890123456L));
    }
    public static boolean validateCard (long num)
    /** Функция, которая принимает число в качестве аргумента и возвращает true, 
     * если это число является действительным номером кредитной карты, 
     * а в противном случае-false. */
    {
        if (!String.valueOf(num).matches("[0-9]{14,19}")) 
            return false;
        long cntrl = num % 10;
        num = num / 10;
        int sum = 0;
        String s = Long.toString(num);
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();

        for (int i=0;i<s.length();i++)
        {
            if (i%2 == 0) 
            {
                int odd = Character.getNumericValue(s.charAt(i)) * 2;
                sum += odd / 10;
                sum += odd % 10;
            }
            else
                sum += Character.getNumericValue(s.charAt(i));
        }
  
        if (10 - sum%10 == cntrl)
            return true;
        return false;
    }
}