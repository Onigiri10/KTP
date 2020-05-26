public class zd10 
{
    public static void main(String[] args)
    {
        System.out.println(hexLattice(19));
    }
    public static String hexLattice(int n) 
    {
        String upHalf = "", middle = "", full = "", lowHalf = "";
        int count = 1, i = 0, j = 0;
        for (i = 1; count < n; i++) 
            count += i*6;
        if (n!=count) 
            return "Invalid";
        for (j = 0; j < i*2-1; j++) 
            middle += "o ";

        upHalf = middle;

        for (j = 1; j < i; j++) 
        {
            upHalf = " " + upHalf.substring(0, upHalf.length()-2);
            middle = upHalf  + "\n" +  middle + "\n" + upHalf;
        }
        return middle;
    }
}