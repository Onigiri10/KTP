import java.util.*;

public class zd6 
{
    public static void main(String[] args)
    {
        System.out.println(ulam(9));
    }       
    public static int ulam(int n) 
    {
        Vector<Integer> seq = new Vector<Integer>();
        seq.add(1); seq.add(2);

        for (int i = 3; i < 2000; i++) 
        {
            int count = 0;
            for (int j = 0; j < seq.size()-1; j++) 
            {
                for (int k = j + 1; k < seq.size(); k++) 
                {
                    if (seq.get(j) + seq.get(k) == i) 
                        count++;
                    if (count > 1) break;
                }
                if (count > 1) break;
            }
            if (count == 1) seq.add(i);
        }
    return seq.get(n-1);
    }  
}