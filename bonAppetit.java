import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
            if(ar_i!=k){
            sum =  sum + ar[ar_i];
            }
        }
        int b = in.nextInt();
        if(b == sum/2){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(b-(sum/2));
        }
    }
}
