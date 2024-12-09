package collection;

import java.util.Arrays;

public class Arrays_sort {
    public static void main(String[] args) {
        int[][] arr = {
            {4,8,3},
            {2,1,6},
            {5,9,7}

        };
        Arrays.sort(arr, (a, b) ->{ return a[0] - b[0];
        });
        for(int e[]:arr){
            for(int ele:e){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
       
    }
    
}
