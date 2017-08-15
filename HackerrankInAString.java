import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String st = "hackerrank";
        int count = 0;
        for(int a0 = 0; a0 < q; a0++){
            count = 0;
            String s = in.next();
            // your code goes here
            for(int i=0;i<s.length();i++){
            if((count < st.length()) && (s.charAt(i) == st.charAt(count))){
                count++;
            }
            }
            if(count == st.length()){
            System.out.println("YES");
            }
            else{
            System.out.println("NO");
            }
        }
    }
}
