package Array;
import java.util.*;

public class duplicateN1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int  dup = duplicate(arr);
        System.out.println(dup);
        sc.close();
    }   
    public static int duplicate(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i-1])
            {
                return arr[i];
            }
        }
    return -1;
    }
}
