package Array;
import java.util.Scanner;

public class minimizeDifference 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array to minimize");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the value of k key : ");
        int k = sc.nextInt();

        int minimize = minimizeDiff(arr,n,k);
        System.out.println("Minimum difference: " + minimize);

        sc.close();
    }    

    public static int minimizeDiff(int arr[],int n,int k)
    {
        int min = arr[0];
        int max = arr[n-1];
        int result = max - min;

        for (int i = 1; i < n; i++)
        {
            max = Math.max(arr[i-1]+k ,arr[n-1]-k);
            min = Math.min(arr[i]-k, arr[0]+k);

            result = Math.min(result ,max - min);
        }
        return result;
    }
}
