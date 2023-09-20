import java.util.*;
import java.util.Arrays;

public class NextPermutation{
    public static void main(String [] args){
        int [] arr = {3,1,5,7};
        nextPermutation(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int [] arr){
        int n = arr.length;

        //first step: find the first element that is smaller than its next element
        int i = n-2;
        while(i>=0; && arr[i]>=arr[i+1])
          i--;

        
        //second step: find the first element that is greator tgan its first step
        if(i>=0)
          int j = n-1;
          while(arr[j]<=arr[i])
             j--;

         //swap
         swap(arr, i, j)

        reverse(arr, i+1, n-1)
    }

    private static void swap(int [] arr, int i, int j){
        int temp = temp[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }   

    private static void reverse(int [] arr,int start,int end){
        while(start<end)
         swap(arr, start, end)
         start++;
         end--;
    }

}