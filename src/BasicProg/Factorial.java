package BasicProg;
import java.util.Scanner;
public class Factorial {

    public void CalcFactorial(int n)
    {
        int fact=1;
        for(int i=1; i<=n; i++)
          {
             fact=fact*i;
          }
        System.out.println("The Factorial is " +fact);

    }
}
