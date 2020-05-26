import java.util.Scanner;

public class zd2 
{
    public static void main(String args[])
    {
        System.out.println("Введите строку со словом 'zip': ");
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();

        System.out.println("Позиция 2-го слова 'zip': ");
        System.out.println(findZip(stroka));
        
    }
    public static int findZip(String stroka) 
    /** Функция, которая ищет позицию 2-го вхождени "zip" в строку */    
    {   
        int index2;
        int index1 = stroka.indexOf("zip");
        if (index1 == -1)
            return index1;
        else
            index2 = stroka.indexOf("zip",index1+1);
        return index2;
    }
    
}