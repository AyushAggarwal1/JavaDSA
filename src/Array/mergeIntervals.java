package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class mergeIntervals{
    public static int[][] mergeInterval(int Intervals[][]){
        Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));

        ArrayList <int[]> list = new ArrayList<>();
        for(int interval[] : Intervals)
        {
            if(list.size()==0)
            {
                list.add(interval);
            }

            else
            {
                int previous[] = list.get(list.size()-1);

                if(interval[0] < previous[1])
                {
                    previous[1] = Math.max(previous[1],interval[1]);
                }

                else
                {
                    list.add(interval);
                }
            }
        }

        return list.toArray(new int[list.size()][2]);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        // Input Format
        int n = scn.nextInt();
        int input[][] = new int[n][2];

        for(int i = 0 ; i <  n ; i++){
            int sp = scn.nextInt();
            int ep = scn.nextInt();

            input[i][0] = sp;
            input[i][1] = ep;
        }

        // Output Format
        int [][]output = mergeInterval(input);

        System.out.print("[");
        for(int arr[] : output){
            System.out.print(Arrays.toString(arr));
        }
        System.out.println("]");

        scn.close();
    }
}