package oopExamples;

public class Circle2
{
    int radius;

    public void  setRadius(int r)
    {
        radius=r;
    }
    public double calculateArea()
    {
        return Math.PI*Math.pow(radius,2);
    }
    public double calculateCircumference()
    {
        return 2*Math.PI*radius;
    }

}
