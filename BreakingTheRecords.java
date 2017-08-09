import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        int min_count=0,max_count=0;
        int min_val = 100000000;
        int max_val = 0;
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
            if(s_i == 0){
                min_val = s[s_i];
                max_val = s[s_i];
            }
            else{
                if(s[s_i]<min_val){
                    min_val = s[s_i];
                    min_count++;
                }
                if(s[s_i]>max_val){
                    max_val = s[s_i];
                    max_count++;
                }
            }
        }
        System.out.println(max_count + " " + min_count);
    }
}
