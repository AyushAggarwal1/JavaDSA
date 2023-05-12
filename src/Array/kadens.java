package Array;
import java.util.Scanner;

public class kadens 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the lenght of the array");
        int n = sc.nextInt();

        System.out.println("enter the values of the array");
        int arr[] = new int[n];

        
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int res = kadensAlgo(arr, n);
        System.out.println(res);
        
        sc.close();
    }

    public static int kadensAlgo(int arr[], int n)
    {
        int sum = arr[0];
        int max_sum = arr[0];

        for(int i = 1; i < n; i++)
        {
            sum = Math.max(arr[i],sum+arr[i]);
            max_sum = Math.max(max_sum,sum);
        }

        return max_sum;
    }
}

