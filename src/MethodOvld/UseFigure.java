package MethodOvld;

import java.util.Scanner;

public class UseFigure {
    public static  void main(String [] args){
      String ch;
      Scanner kb= new Scanner(System.in);
      System.out.println("Enter your choice of figure to be calculated:\n 1.Square \n 2.Rectangle \n 3.Circle");
      ch=kb.next();

      Figure obj=new Figure();

      if(ch.equalsIgnoreCase("Square"))
      {
        System.out.println("Enter the sides of a square:");
        int a=kb.nextInt();
        System.out.println("Area of square is "+obj.calcArea(a));
      }
      else if(ch.equalsIgnoreCase("rectangle"))
      {
        System.out.println("Enter the length of a rectangle:");
         int a=kb.nextInt();
        System.out.println("Enter the breadth of a rectangle:");
         int b=kb.nextInt();
        System.out.println("Area of rectangle is "+obj.calcArea(a,b));
      }
      else if(ch.equalsIgnoreCase("Circle"))
      {
        System.out.println("Enter the radius of the circle:");
        double r=kb.nextDouble();
        System.out.println("Area of Circle is "+obj.calcArea(r));
      }
      else
      {
        System.out.println("Wrong Input!");
      }


    }


}
