package MethodOvld;

public class Figure
{
    public double  calcArea(int a)
    {
        return a*a;
    }
    public double calcArea(int a, int b)
    {
        return a*b;
    }
    public double calcArea(double r)
    {
        return 2*Math.PI*Math.pow(r,2);
    }
}
