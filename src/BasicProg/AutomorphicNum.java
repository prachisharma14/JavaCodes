package BasicProg;

import java.util.Scanner;

public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sq=num*num;
        int count=0;
        for(int i=num; i>0; i=i/10)
            count++;
        int tDigit=count;
        int lastDigit=sq%(int)Math.pow(10,tDigit);
        if(num==lastDigit)
            System.out.println("Automorphic");
    }
}
