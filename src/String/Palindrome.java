package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        String rev="";
        for(int i=str.length()-1; i>=0; i--)
        {
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);
        if(str.equals(rev))
        {
            System.out.println(str+" is palindrome");
        }
        else {
            System.out.println(str+" is not palindrome");
        }
    }
}
