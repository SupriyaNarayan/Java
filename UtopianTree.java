import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count=1;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            if(n==0){
                System.out.println("1");
            }
            else{
                for(int b0 = 1; b0 <= n; b0++){
                    if(b0%2==0){
                        count=count+1;
                    }
                    else{
                       count= count*2;
                    }
                }
                System.out.println(count);
                count=1;
            }
        }
    }
}
