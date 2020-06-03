
public class Point2d 
{
    private double xCoord;
    private double yCoord;

    public Point2d(double x, double y) 
    //Конструктор инициализации
    {
        xCoord = x;
        yCoord = y;
    }
    public Point2d() 
    //Конструктор по умолчанию/вызовите конструктор с 2 параметрами и определите источник
    {
        this(0,0);
    }
    public double getX()
    //возвращение координаты Х
    {
        return xCoord;
    }
    public double getY()
    //возвращение координаты Y
    {
        return yCoord;
    }
    public void setX(double val)
    //установка значения координаты X
    {
        xCoord = val;
    }
    public void setY(double val)
    //установка значения координаты Y
    {
        yCoord = val;
    }

Point2d myPoint = new Point2d(); //создает точку (0,0)
Point2d myOtherPoint = new Point2d(5,3); //создает точку (5,3)
Point2d aThirdPoint = new Point2d)();
}