package Array;
import java.util.Scanner;

public class largestContiguoussubarraySum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lenght of the array to rotate");

        int n1 = sc.nextInt();
        int arr[] = new int[n1];

        for(int i = 0; i < n1; i++)
        {
            arr[i] = sc.nextInt();
        }

        int brute = bruteSum(arr, n1);
        System.out.println("using brute force... " + brute);

        int kadens = kadenSum(arr, n1);
        System.out.println("using kadenSum force..... " + kadens);
        sc.close();
    }    
    public static int bruteSum(int arr[], int n)
    {
        int maxsum = Integer.MIN_VALUE;

         for(int i = 0; i < n-1; i++)
         {
            int sum = 0;
            for(int j = i; j <n-1; j++) 
            {
                sum += arr[j];
                if(sum > maxsum)
                {
                    maxsum = sum;   
                }
            }
         }

         return maxsum;
    }

    public static int kadenSum(int arr[], int n)
    {
        int maxsum = 0;
        int currsum = 0;

        for(int i = 0; i < n; i++)
        {
            currsum += arr[i];

            if(currsum > maxsum)
            {
                maxsum = currsum;
            }

            if(currsum < 0)
            {
                currsum = 0;
            }
        }
        return maxsum;
    }
}
