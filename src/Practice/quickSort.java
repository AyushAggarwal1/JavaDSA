package Practice;

public class quickSort {
    public static void main(String[] args) {
        int arr[] = {3,4,8,2,1,5};
        quick(arr, 0, arr.length-1);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } 
    }

    static void quick(int arr[], int si, int ei){
        
        if(si < ei){
         int pi = partition(arr, si, ei);
             
         quick(arr, si, pi-1);
         quick(arr, pi+1, ei);
         
        }
         // code here
     }
     static int partition(int arr[], int si, int ei){
         // your code here
         
         int count = si-1;
         
         int piviot = arr[ei];
         
         for(int i=si; i<ei; i++){
            if(arr[i]<=piviot){
                count++;

                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
            }
         }

        //  count++;
        //  swap(arr[count],arr[ei]);
         
         int temp = arr[count+1];
         arr[count+1] = arr[ei];
         arr[ei] = temp;

         return count+1;
     } 


     
     static void swap(int a, int b){
         int temp = a;
         a = b;
         b = temp;
     }
}
