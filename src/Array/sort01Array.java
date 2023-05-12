package Array;

import java.util.*;
public class sort01Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the array : ");
        int length = sc.nextInt();

        System.out.println("Enter the array in 0's, 1's and 2's : ");
        int arr[] = new int[length];
        for(int i=0; i<length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered : ");
        printarr(arr);

        System.out.println("Sorted array : ");
        int sort[] = sortedarr(arr,length);
        printarr(sort); 
        
        sc.close();
    }
 
    public static void printarr(int arr[]) 
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static int[] sortedarr(int arr[],int length) 
    {
        int temp;
        for(int i=0; i<length; i++)
        {
            for(int j=i+1; j<length; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;    
    }
}
