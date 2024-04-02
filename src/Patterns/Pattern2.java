package Patterns;

public class Pattern2
{
    public static void main(String [] args)
    {

         int i,j;
        for( i=0; i<=3; i++)
        {
            for( j=0; j<=3; j++)
            {

                if( i==0|| j==3 || i==3 || j==0)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}


