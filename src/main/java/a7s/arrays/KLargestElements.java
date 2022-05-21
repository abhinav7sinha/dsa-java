package a7s.arrays;

import java.util.Arrays;

/*
https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1/
 */
public class KLargestElements {
    public static int[] kLargest(int[] arr, int n, int k) {
        // TODO: to sort array in decreasing order, make use of the Comparator class
        Arrays.sort(arr);
        int[] sol = new int[k];

        for (int i=n-1; i>n-1-k; i--){
            sol[n-1-i]=arr[i];
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 787, 1, 23};
        System.out.println(Arrays.toString(kLargest(arr,5,2)));
    }
}