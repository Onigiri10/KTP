public class zd5 
{
    public static void main(String[] args)
    {
        System.out.println(BMI("205 pounds", "73 inches"));
    }
    public static String BMI(String weight, String height) 
    {
        String[] w = weight.split(" ");
        String[] h = height.split(" ");
        String result = "";

        double kilos = w[1].equals("pounds") ? Double.parseDouble(w[0]) * 0.453592 : Double.parseDouble(w[0]);
        double meters = h[1].equals("inches") ? Double.parseDouble(h[0]) * 0.0254 : Double.parseDouble(h[0]);

        double val = kilos / (meters * meters);
        val = Math.round(val * 10.0)/10.0;

        if (val < 18.5) 
            result += val+" Underweight";
        if (val >= 18.5 && val <= 24.5) 
            result += val + " Normal weight";
        if (val >= 25 ) 
            result += val + " Overweight";

        return result;
    }
}