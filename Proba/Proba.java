import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine(); 
        String[] sub_str = stroka.split(" ");
        for (int i=0; i<sub_str.length; i++)
        {
            System.out.println(isPalindrome(sub_str[i]));
        }
    }
    public static String reverseString(String S)
    
    {
        String rez = "";
        int j = 0;
        for (int i=S.length()-1; i>=0; i--)
        {
            rez += S.charAt(i);
            j++;
        }
        return rez;
    }
    public static boolean isPalindrome(String s)
    {
        String rez2 = "";
        rez2 = reverseString(s);
        return rez2.equals(s);
    }
}
