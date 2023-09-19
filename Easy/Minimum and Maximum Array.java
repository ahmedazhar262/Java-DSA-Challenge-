import java.uil.*;
public class MaxandMinArray{
    public static void main(String [] args){
        int arr[]={6, 3, 4, 1, 9, 2};
        findMinandMaxArray(arr);

    }
    static void findMinandMaxArray(int arr[]){
        if(arr==null && arr.length==0)
          return ;
        
        int Min=arr[0];
        int Max=arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]< Min)
              Min=arr[i];

            if(arr[i]>Max)
              Max=arr[i];
        }

    }
    System.out.println("Minimum Array" + Min);
    System.out.println("Maximum Array" + Max);