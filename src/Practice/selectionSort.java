package Practice;

public class selectionSort 
{
    public static void main(String[] args) 
    {
        int arr[] = {6,4,3,5};
        System.out.println("Given array is : ");
        print(arr);
        selection(arr);   
        print(arr);        
    }
    
    public static void selection(int arr[])
    {
        int n =arr.length;

        for(int i=0; i<n-1; i++)
        {
            int minimum = i;

            for(int j=i+1; j<n; j++)
            {
                if(arr[j] < arr[minimum])
                {   
                    minimum = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
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
