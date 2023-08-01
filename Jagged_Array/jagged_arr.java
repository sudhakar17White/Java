package Jagged_Array;

import java.util.*;
public class jagged_arr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[][]={
            new int[] {1,2,3,4},
            new int[] {5,6},
            new int[] {7,8,9},
            new int[] {10,11,12}
        };
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
