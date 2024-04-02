package Array;

import java.util.Scanner;

public class sum1D {
    public static void main(String[] args)
    {
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=kb.nextInt();

       int [] arr= new int [n];
       for (int i=0; i<n; i++)
       {
           System.out.println(i+" element of array:");
           arr[i]=kb.nextInt();
       }
       int sum=0;
       for(int i=0; i<n; i++)
       {
           System.out.println(arr[i]);
           sum=sum+arr[i];
       }
        System.out.println("Sum of all the elements i the array is:"+sum);
       System.out.println("Average of all the elements is:"+(float)sum/n);
    }

}
