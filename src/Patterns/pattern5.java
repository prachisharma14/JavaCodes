package Patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows to pe printed: ");
        int n=sc.nextInt();
        int i,j;
        for( i=1; i<=n; i++)
        {
            for ( j=1; j<=n; j++)
            {
                if(i==j)
                    System.out.println("*");
                while(i==j)
                {
                    if(i>j || i<j)
                    {
                        System.out.print("*");
                    }
                    if(n-n==0 || n-(n-1)==1 || (n-1)-n==-1)
                        System.out.print(" ");
                }

            }
        }
    }
}
