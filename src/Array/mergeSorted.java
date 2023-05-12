package Array;  

import java.util.*;

public class mergeSorted 
{   
    public static void main(String[] args) 
    {
        int arr1[] = {2,4,5};
        int arr2[] = {3,6,7};
        merge(arr1, arr2,arr1.length,arr2.length);
        print(arr1);
        print(arr2);
    }  
    
    public static void merge(int[] arr1, int[] arr2, int n, int m)
    {
        int i = n-1;
        int j = 0;

        while(i >= 0 && j < m)
        {
            if(arr1[i] >= arr2[j])
            {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;

                i--;
                j++;
            }
            else
            {
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void print(int arr[]) 
    {
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }  
        System.out.println("");
    }
}
