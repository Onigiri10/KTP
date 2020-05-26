public class zd4 
{
    public static void main(String[] args)
    {
		double[] work = {16, 18, 30, 1.8};
	    System.out.println(overTime(work));
    }
    public static String overTime(double[] work) {
        double sum = 0;
        if (17 - work[0] >= 0)
            sum += (17 - work[0]) * work[2];
        if (work[1] - 17 >= 0)
            sum += (work[1] - 17) * work[2] * work[3];
        return ('$' + String.valueOf(sum));
    }
}