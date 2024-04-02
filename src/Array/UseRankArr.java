package Array;

import java.util.Arrays;

public class UseRankArr {
    // Driver Code
    public static void main(String[] args)
    {
// Given array arr[]
        int[] arr = { 100, 2, 70, 12 , 90};
// Function Call
        RankArr obj=new RankArr();
        obj.changeArr(arr);
// Print the array elements
        System.out.println(Arrays.toString(arr));
    }
}

