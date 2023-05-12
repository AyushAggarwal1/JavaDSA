package Array;

public class maxMinArray 
{
    public static void maxmin(int arr[]) 
    {
        int min = arr[0];
        int max = arr[arr.length-1];

        for(int i=0;i<arr.length;i++)
        {
            
            if(min>arr[i])
            {
                min=arr[i];
            }
            else if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Minimun is : "+min + " Maximum is : "+max);
    }    

    public static void print(int arr[]) 
    {
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }  
        System.out.println("");
    }

    public static void main(String[] args) 
    {
        int arr[] = {2,2,3,4,9,-1,19,1,0,19};
        System.out.println("Given array is : ");
        print(arr);
        maxmin(arr);
    }
}
