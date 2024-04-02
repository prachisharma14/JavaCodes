package BasicProg;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int num=kb.nextInt();
        int temp=num;
        int rev=0;
        int rem;

        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            num=temp/10;

        }
        if(num==rev)
        {
            System.out.println("Is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
