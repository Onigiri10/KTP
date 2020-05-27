public class zd8 
{
    public static void main(String[] args)
    {
        System.out.println(convertToRoman(16));
    }
    public static String convertToRoman(int number) {
        String rez = "";

        while (number >= 1000) 
        {
            rez += "M";
            number -= 1000;        
        }
        while (number >= 900) 
        {
            rez += "CM";
            number -= 900;
        }
        while (number >= 500) 
        {
            rez += "D";
            number -= 500;
        }
        while (number >= 400) 
        {
            rez += "CD";
            number -= 400;
        }
        while (number >= 100) 
        {
            rez += "C";
            number -= 100;
        }
        while (number >= 90) 
        {
            rez += "XC";
            number -= 90;
        }
        while (number >= 50) 
        {
            rez += "L";
            number -= 50;
        }
        while (number >= 40) 
        {
            rez += "XL";
            number -= 40;
        }
        while (number >= 10) 
        {
            rez += "X";
            number -= 10;
        }
        while (number >= 9) 
        {
            rez += "IX";
            number -= 9;
        }
        while (number >= 5) 
        {
            rez += "V";
            number -= 5;
        }
        while (number >= 4) 
        {
            rez += "IV";
            number -= 4;
        }
        while (number >= 1) 
        {
            rez += "I";
            number -= 1;
        }
        return rez;
    }
}