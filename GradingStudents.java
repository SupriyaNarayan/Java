import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
            if(grades[grades_i]>37 && (grades[grades_i] % 5)>2){
                grades[grades_i] = grades[grades_i] + (5-(grades[grades_i] % 5));
            }
            System.out.println(grades[grades_i]);
        }   

    }
}
