package oopExamples;

public class Circle1
{
   int radius;

   public void setRadius(int r)
   {
       radius=r;
   }
   public double calculateArea()
   {
      double ar;
      ar=Math.PI*Math.pow(radius,2);
      return ar;
   }
   public double calculateCircumference()
   {
      double circ;
      circ=2*Math.PI*radius;
      return circ;
   }

}
