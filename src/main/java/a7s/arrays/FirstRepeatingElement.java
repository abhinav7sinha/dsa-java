package a7s.arrays;

import java.util.HashMap;

/*
https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1/
 */

public class FirstRepeatingElement {

    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sol=-1;
        for (int i=0; i<n; i++){
            if (map.containsKey(arr[i])){
                if (sol==-1){
                    sol=map.get(arr[i]);
                }else{
                    sol=Math.min(sol, map.get(arr[i]));
                }
            }else{
                map.put(arr[i], i+1);
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int n = 7;

        System.out.println(firstRepeated(arr, n));
    }
}
