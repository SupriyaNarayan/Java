import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaeserCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        StringBuilder sb=new StringBuilder();
        int a=0;
        for(int i=0;i<n;i++)
        {
        	a=(int) s.charAt(i);
        	if(a>=97 && a<=122)
        	{
        		if(a+k>122)
        		{
        			sb.append(((char)(97+(a-97+k)%26)));
        		}
        		else
        		sb.append((char)(a+k));
        	}
        	else if(a>=65 && a<=90)
        	{
        		if(a+k>90)
        		{
        			sb.append((char)(65+(a-65+k)%26));
        		}
        		else
        		sb.append((char)(a+k));
        	}
        	else
        	{
        		sb.append(s.charAt(i));
        	}
        }
        System.out.println(sb.toString());
    }
}
