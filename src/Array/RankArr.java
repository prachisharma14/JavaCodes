package Array;

import java.util.Arrays;

public class RankArr {
        static void changeArr(int[] input)
        {
// Copy input array into newArray
            int newArray[] = Arrays.copyOfRange(input, 0, input.length);
// Sort newArray[] in ascending order
            Arrays.sort(newArray);
            for(int i=0; i< input.length; i++){
                for(int j=0; j< input.length; j++){
                    if(newArray[j]==input[i])
                    {
                        input[i] = j+1;
                        System.out.println(input[i]);
                        break;
                    }
                }
            }
        }

}
