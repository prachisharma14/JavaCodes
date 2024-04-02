package BasicProg;

import java.util.Scanner;

public class UseFactorial {
    public static void main(String[] args)
    {
        System.out.println("enter the value of n ");
        Scanner kb= new Scanner(System.in);
        int n=kb.nextInt();
        Factorial obj=new Factorial();
        obj.CalcFactorial(n);


    }
}
