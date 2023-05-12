package Array;
import java.util.*;

public class unionOfArray
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array1");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter the number of elements in the array2");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        System.out.println("Enter the elements in the array1");
        for(int i = 0; i < n1; i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements in the array2");
        for(int j = 0; j < n2; j++)
        {
            arr2[j] = sc.nextInt();
        }

        int uArray1 = union(arr1, arr2);
        int uArray2 = doUnion(arr1,n1, arr2, n2);
        System.out.println("Union is using 1st method"+uArray1);
        System.out.println("Union is using 2nd method"+uArray2);
        sc.close();
   }

   public static int union(int arr1[], int arr2[])
   {
        HashSet<Integer> union = new HashSet<Integer>();

        for(int i = 0; i <arr1.length; i++)
        {
            union.add(arr1[i]);
        }

        for(int i = 0; i <arr2.length; i++)
        {
            union.add(arr2[i]);
        }

        return union.size();
   }

   public static int doUnion(int arr1[], int n, int arr2[],int m) // tle occur
   {
       int count = 1 ;

       int cArr[] = new int[n+m];
       for(int i = 0; i < arr1.length; i++)
       {
           cArr[i] = arr1[i];
       }

       for(int j = 0; j < arr2.length; j++)
       {
           cArr[n+j] = arr2[j];
       }
    //    System.out.println(Arrays.toString(cArr));

       for(int k=1; k < cArr.length; k++)
       {
           int a = 0;
           for(a=0; a<k; a++)
           {
               if(cArr[k] == cArr[a])
               {
                   break;
               }
           }
           if(k==a)
           {
               count++;
           }
       }
       return count;
   }
}
