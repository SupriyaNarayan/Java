import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=0;
        int prevCount = 0;
        while (p!=n){
        int count = 0;
        int count3=0;
        int count1=0;
        int count2=0;
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        p++;
        count1 = i+j;
        count2 = j+k;
        count3 = i+k;
        if(count1>count2){
            if(count1>count3){
                count = count1;
            }
            else{
                count = count3;
            }
        }
        else{
            if(count3>count2){
                count=count3;
            }
            else{
                count=count2;
            }
        }
        if(count>prevCount){
            prevCount = count;
        }
        }
        System.out.println(prevCount);
    }
}
