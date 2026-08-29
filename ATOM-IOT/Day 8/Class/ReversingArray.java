package JavaDsa;

import java.util.Arrays;
public class ReversingArray {
    public static void main(String[] args) {

        int arr [] = {1,2,4,5,6,8,9};

        reverse(arr);

    }

    public static void reverse(int arr[] ) {

        //from the revrse take the elements insert it from first
        int n = arr.length;

        int temp [] = new int[n];

        for(int i=arr.length-1; i>=0; i--) {

            temp[n-i-1] = arr[i];


        }
        System.out.println(Arrays.toString(temp));

    }

    public static void reverseArr(int [] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int temp;

        for ( int i=0;i<n/2;i++) {


            temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}