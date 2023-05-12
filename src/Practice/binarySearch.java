package Practice;
import java.util.*;

public class binarySearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("entter the elements of the array");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the number to find the element using binarySearch");
        int find = sc.nextInt();

        Arrays.sort(arr);

        int index = binarySearchs(arr, n, find);
        System.out.println(index);
        sc.close();
    }

    public static int binarySearchs(int arr[], int n, int find)
    {
        int start = 0;
        int end = n-1;

        while(start <= end)
        {
            int mid = (start + end)/2 ;
            if (find == arr[mid])
            {
                return mid;
            }

            if(find < arr[mid])
            {
                end = mid - 1;
            }

            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }
}
