package BasicProg;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        int x=b.nextInt();
        int y=b.nextInt();
        int z=b.nextInt();

        int sum=x+y+z;
        System.out.println(sum);
        int temp;
        int addition_of_sum=0;
        while(sum>0)
        {
            temp=sum%10;
            addition_of_sum=addition_of_sum+temp;
            sum=sum/10;
        }
        //int num=sum+sum;

        System.out.println(addition_of_sum%10);

    }
}
