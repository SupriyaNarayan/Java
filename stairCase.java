/* base and height of the output is equal to the number n,and the image is drawn using '#' which looks like a staircase*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
String s= "#";
String p= " ";
for(int i=1;i<=n;i++){
String repeated = new String(new char[i]).replace("\0", s);
String spaces = new String(new char[n-i]).replace("\0", p);
System.out.println(spaces+repeated);
}
}
}
