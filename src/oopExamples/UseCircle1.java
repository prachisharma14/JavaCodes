package oopExamples;

import java.util.Scanner;

public class UseCircle1 {
    public static void main(String [] args)
    {
        int r;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=kb.nextInt();

        Circle1 obj= new Circle1();
        obj.setRadius(r);
        double res;
        res=obj.calculateArea();
        System.out.println("area is"+res);
        res=obj.calculateCircumference();
        System.out.println("circumference is:"+res);

    }
}

