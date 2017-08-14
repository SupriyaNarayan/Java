import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        int max = 0;
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        for(int i=0;i<n;i++){
            for(int j=0;j<m ; j++){
                int temp = keyboards[i] + drives[j];
                if(temp<= s && temp> max){
                    max = temp;
                }
            }
        }
        if(max!=0){
        System.out.println(max);
        }
        else{
            System.out.println("-1");
        }
    }
}
