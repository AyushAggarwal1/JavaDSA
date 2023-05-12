package Array;
import java.util.Scanner;

public class cylinderRotate 
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

        System.out.println("enter shift parameter");
        int k = sc.nextInt(); 

        System.out.println("Using method 1");
        rotate1(arr,k);
        printarr(arr);

        System.out.println("Using method 2");
        int rArray[] = rotate2(arr,n1);
        printarr(rArray);
        sc.close();
    }

    public static void reverse(int[] nums , int low, int high)
    {
        while(low < high)
        {
            swap(nums, low, high);
            low++;
            high--;
        }
    }
    
    public static void swap(int arr[], int n1 , int n2)
    {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
    
    public static void rotate1(int[] nums, int k) 
    {
        int n = nums.length;
        
        k = k%n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }

    public static int[] rotate2(int[] arr,int n)
    {
        int temp = n-1;

        for(int i=temp; i>=1; i--)
        {
            int te = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = te;
        }

        return arr;
    }

    public static void printarr(int[] arr)
    {
        for(int i = 0; i <arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

