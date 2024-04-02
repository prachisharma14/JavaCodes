package String;

import java.util.Scanner;

public class PalindromeUsingWhile {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        int i=0;
        int j=str.length()-1;
        while( i< j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                System.out.println("palindrome");
                i++;
                j--;
            }

            else{
            System.out.println("not palindrome");
            }
        }

    }
}
