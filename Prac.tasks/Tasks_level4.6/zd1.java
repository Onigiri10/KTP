import java.util.*;

public class zd1 
{
    public static void main(String[] args) 
    {
		Scanner input = new Scanner(System.in);
		System.out.print("n: ");
		int n = Integer.parseInt(input.nextLine());
		System.out.print("k: ");
		int k = Integer.parseInt(input.nextLine());
		System.out.printf("String: ");
		String text = input.nextLine();
		System.out.println(Essay(n, k, text));
    }
    public static String Essay(int n, int k, String s)
    {
        String[] text=s.split(" ");
        s = "";
        String Curr = "";
        for(int i = 0; i < n; i++)
        {
            if (Curr.length() + text[i].length() > k)
            {
                s=s.trim() + "\r\n" + text[i] + " ";
                Curr=text[i];
            }
            else
            {
               s += text[i] + " ";
               Curr += text[i];
            }
        }
        return s.trim();
    }
}