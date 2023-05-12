package tcs;

public class countFreqArray
{
    public static void main(String[] args)
    {
        int arr[] ={10,5,10,15,10,5};

        int n = arr.length;
        count(arr, n);
    }
    public static void count(int []arr,int n)
    {
        boolean visit[] = new boolean[n];

        int count = 1;
        for(int i=0; i<n; i++)
        {

            if(visit[i]==true)
            {
                continue;
            }
            for(int j=i+1; j<n; j++)
            {
                if(arr[i]==arr[j])
                {
                    visit[j]=true;
                    count = count + 1;
                }
            }
            System.out.println(arr[i]+" "+count);
            count =1;
        }

    }
}
