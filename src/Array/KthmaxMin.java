package Array;

import java.util.*;
public class KthmaxMin 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int length = sc.nextInt();  

        int arr[] = new int[length];
        System.out.println("Now enter the elements of array : ");
        for(int i=0; i<=length-1; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of Kth : ");
        int Kth = sc.nextInt();

        System.out.println("You entered this array : ");
        printArr(arr);

        System.out.println("Sorted array is : ");
        sort(arr);
        printArr(arr);

        System.out.println("Kth value is : ");
        int ans = FindKth(arr, Kth);
        System.out.println(ans);
        sc.close();
    }       

    public static void printArr(int arr[]) 
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }    
        System.out.println("");
    }

    public static int[] sort(int arr[]) 
    {
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static int FindKth(int arr[], int kth) 
    {   
        int value = arr[kth-1];
        return value;
    }
}
