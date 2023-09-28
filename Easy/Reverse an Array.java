import java.util.*;
public class ReverseArray{
    public static void main(String [] args){
        //Array and Function Declaration 
        int [] a={3,1,9,-2,8,9,0,7,4,6,46,98,23,81};
        ReverseanArray(a);

        System.out.println(Arrays.toString(a));

    }
    static void ReverseanArray(int[] a){
        int n= a.length;

        for(int i=0; i<n/2; i++){
            
            int temp = a[i];
             a[i]= a[n-1-i];
             a[n-1-i] = temp;
        }
           
    }
}