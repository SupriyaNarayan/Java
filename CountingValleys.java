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
        int res = 0;
        int pos = 0;
        String steps = sc.next();
        boolean flag = false;
        for (int i = 0; i < n; i++){
            if (steps.charAt(i) == 'U')
            {pos++;}
            else {pos--;}
            if (pos < 0 && flag == false) {
                res++;
                flag = true;
            }
            if (pos >= 0) flag = false;
        }
        System.out.println(res);
    }
}
