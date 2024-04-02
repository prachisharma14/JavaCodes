package oopExamples;

import java.util.Scanner;

public class UseCircle2
{
    public static void main(String [] args)
    {
        int x;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the Radius:");
        x=kb.nextInt();

        Circle2 obj= new Circle2();

        obj.setRadius(x);
        System.out.println("Area is"+obj.calculateArea());
        System.out.println("Circumference is"+obj.calculateCircumference());

    }

}
