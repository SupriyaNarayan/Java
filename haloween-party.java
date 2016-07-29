import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution1 {
	
	 static void max_Chocolates(int[] arr) {
		 for(int i=0;i<arr.length;i++)
		 	{
		 		System.out.println(max_pieces(arr[i]));
		 	}

	    }
	 
    static long max_pieces(int n) {
    	if (n == 1)
    		return 0;
    	if (n == 2)
			return 1;
		else {
			if (n % 2 == 0)
			{
				// For an eventh number cut n, the answer would be 
				// summation of all odd numbers until (n-1). 
				// 1 + 3 + 5 + ... + n-1 = n^2
				return (long)Math.pow(n/2, 2);
			}
			else
			{
				// This recursive function works for all cases but
				// we were hitting stack overflow for cuts over 100000.
				// Hence the special case for even cuts.
				return max_pieces(n-1)+(n/2);
			}
		}
	}

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine());
            _arr[_arr_i] = _arr_item;
        }
        
        max_Chocolates(_arr);
        
    }
}
