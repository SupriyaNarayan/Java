import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            sum = sum + arr[arr_i];
        }
        Arrays.sort(arr);
        int min_sum = sum - arr[4];
        int max_sum = sum - arr[0];
        System.out.println(min_sum + " " + max_sum);
    }
}
