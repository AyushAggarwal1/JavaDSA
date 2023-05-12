package Array;

public class reverseArray 
{
    public static void reverse1(int arr[]) 
    {
        int temp;
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void reverse2(int arr[]) 
    {
        for(int i=arr.length-1; i>=0;i--)
        {
            System.out.println(arr[i]);
        }    
    }
    public static void print(int arr[]) 
    {
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }    
    }

    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};
        System.out.println("Array before Reverse : ");
        print(arr);

        System.out.println("Array after Reverse using reverse 1 : ");
        reverse1(arr);
        print(arr);

        System.out.println("Array after Reverse using reverse 2 : ");
        reverse1(arr);
    }
}
