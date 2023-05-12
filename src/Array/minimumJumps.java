package Array;

import java.util.Scanner;

public class minimumJumps 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array to minimize jump");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int jump = minimumJump(arr);
        System.out.println("Jumps are: " + jump);
        sc.close();
    } 
    public static int minimumJump(int arr[])
    {

        //    greedy approach perfectly works
        int n = arr.length;
        int jumps = 0;
        int curMax = 0;
        int curReach = 0;
        
        for(int i=0;i<n-1;i++)
        {
            if(arr[i] + i> curMax)
              curMax = arr[i]+ i;
              
            if(i == curReach)
            {
                jumps++;
                curReach  = curMax;
            }
            if(arr[i] == 0 && i == curMax )
            return -1;
        }
        return jumps;
        
    //    dp approach: dont pass all test cases
    
    /* int n = arr.length;
        int dp[] = new int[n];  // the minimum number of jumps from a position to the last position
        
        dp[n - 1] = 0;
        
        for (int i = n - 2; i >= 0; i--) {
            int min = Integer.MAX_VALUE;    // the minimum number of jumps from position i to the last position
            
            for (int j = i + 1; j < n && j <= i + arr[i]; j++) {   // can jump from the position i to the position j
                if (dp[j] == Integer.MAX_VALUE) continue;           // cannot jump from the position j to the last position
                min = Math.min(dp[j] + 1, min);                     // dp[j] + 1 means jump from i to j and then jump to the last
            }
            
            dp[i] = min;
        }
        
        return dp[0];
        */

        // int maximumReach = arr[0];
        // int steps = arr[0];
        // int jumps = 1;

        // if(n==1)
        // {
        //     return 0;
        // }

        // else if(arr[0]==0)
        // {
        //     return -1;
        // }

        // else
        // {
        //     for(int i = 0; i < n; i++)
        //     {
        //         if(i==n-1)
        //         {
        //             return jumps;
        //         }

        //         maximumReach = Math.max(maximumReach,i+arr[i]);
        //         steps --;
        //         if(steps==0)
        //         {
        //             jumps++;
        //             if(i>maximumReach)
        //             {
        //                 return -1;
        //             }
        //             steps = maximumReach-i;
        //         }
        //     }
        // }
    }   
}


