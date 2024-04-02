package Patterns;

import java.util.Scanner;

public class Pattern3
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows to pe printed: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                if(i<=j)
                {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }

                //if(i>=j)
                //{
                   // System.out.print("*");

                //}


            }
            System.out.println(" ");
        }

    }
}
