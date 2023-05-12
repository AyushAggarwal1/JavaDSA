package Practice;

public class bubbleSort 
{
    public static void main(String[] args) 
    {
        int arr[] = {2,2,3,4,9,-1,19,1,0,19};
        System.out.println("Given array is : ");
        print(arr);
        bubble(arr);;   
        print(arr); 
    }   

    public static void bubble(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
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
