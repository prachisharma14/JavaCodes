package oopExamples;

import java.util.Scanner;

public class UseCircle
{
    public static void main(String [] args)
    {
        int r;
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=kb.nextInt();

        Circle obj=new Circle();
        obj.setRadius(r);
        obj.calculateArea();
        obj.calculateCircumference();

    }

}
