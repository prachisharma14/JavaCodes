package BasicProg;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int num=kb.nextInt();
        int sum=0;
        int temp;
        while(num>0)
        {
            temp=num%10;
            sum=sum+temp;
            num=num/10;
        }
        System.out.println(sum);
    }
}
