import java.util.Scanner;

public class zd4 
{
    public static void main(String args[])
	{
        
        System.out.println("Введите вероятность: ");
        Scanner in = new Scanner(System.in);
        double prob = Double. parseDouble(in.nextLine());
        System.out.println("Введите сумму выигрыша: ");
        int prize = in.nextInt();
        System.out.println("Введите ставку: ");
        int pay = in.nextInt();

        System.out.println("Стоит ли играть? ");
        System.out.println(profitableGamble(prob,prize,pay));
    }
    public static boolean profitableGamble(double prob, int prize, int pay) 
    /** Функция, которая подсчитывает выгоду игры */    
    {   
        if ((prob * prize - pay) > 0) { 
            return true;
        }
        else{
            return false;
        }
            
    }
}