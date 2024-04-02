package Array;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+" elements:");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int x ;
        System.out.println("Enter the value to find its pair:-");
        x= sc.nextInt();
        for(int i=0;i< arr.length;i++)
        {
            int sum=0;
            for(int j=i+1;j<arr.length;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==x)
                    System.out.println(arr[i]+" "+" "+arr[j]);
            }
        }
    }
}
