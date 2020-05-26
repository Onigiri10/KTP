import java.util.Scanner;

public class zd2 
{
    public static void main(String args[])
    {
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();

        System.out.println(" ");
        System.out.println(split(stroka));
        
    }
    public static String split(String stroka) 
    /*Функция, которая группирует строку в кластер скобок*/    
    {
        int count1 = 0;
        int count2 = 0; 
        String rez = "";
        

        for (int i = 0; i < stroka.length(); i++)
        {
            if (stroka.charAt(i) == ' ')
                continue;
            if (stroka.charAt(i) == '(')
            {    
                count1 += 1;
                rez += "(";
            }  
            else if (stroka.charAt(i) == ')')
            {
                count2 += 1;
                rez += ")";
            }
            if (count1 == count2)
            {
                if (i == stroka.length()-1)
                    break;
                rez += ", ";
                count1 = 0;
                count2 = 0;
            }
        }
        return rez;
    }
}