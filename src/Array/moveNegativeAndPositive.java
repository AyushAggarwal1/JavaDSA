package Array;

import java.util.*;
public class moveNegativeAndPositive     
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = sc.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter elements");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Sorted array is : ");
        int sarray1[] = sort1(arr);
        System.out.println("Sorted 1");
        printarr(sarray1);

        int sarray2[] = sort2(arr);
        System.out.println("Sorted 2");
        printarr(sarray2);
        sc.close();
    }

    public static int[] sort1(int arr[]) 
    {
        int temp;
        int j=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < 0)
            {
                if (i != j) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;    
    }    

    public static int[] sort2(int arr[]) 
    {
        int left = 0;
        int right = arr.length-1;
        
        while (left <= right)
        {
         
            // Condition to check if the left
            // and the right elements are
            // negative
            if (arr[left] < 0 && arr[right] < 0)
                left++;
    
            // Condition to check if the left
            // pointer element is positive and
            // the right pointer element is negative
            else if (arr[left] > 0 && arr[right] < 0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
    
            // Condition to check if both the
            // elements are positive
            else if (arr[left] > 0 && arr[right] > 0)
                right--;
                
            else
            {
                left++;
                right--;
            }
        }
        return arr;    
    }

    public static void printarr(int arr[]) 
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }    
        System.out.println();
    }
}
