package BasicProg;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        int n;
        int i;
        System.out.println("Enter an integer:");
        n=kb.nextInt();
        for(i=2; i<=n-1; i++)
        {
           if (n%i==0)
               break;
        }

        if(i==n)
            System.out.println(n+"is a prime no.");
        else
            System.out.println(n+"is not a prime no.");
    }

}
