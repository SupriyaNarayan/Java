import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int arr[] = new int[n];
int count=0;
int s=10000;
ArrayList<Integer> mylist = new ArrayList<Integer>();
  for(int i=0; i < arr.length; i++){
    arr[i] = in.nextInt();
    mylist.add(arr[i]);
  }
  while(!mylist.isEmpty())
  {
    for(int i=0; i < mylist.size(); i++){
      if(mylist.get(i) < s && mylist.get(i)!=0){
        s = mylist.get(i);
        }
      }
      for(int i=0; i < mylist.size(); i++){
        if(mylist.get(i) >= s){
          int k= mylist.get(i);
          k=k-s;
          mylist.remove(i);
          mylist.add(i, k);
          count=count+1;
        }
      }
      System.out.println(count);
      if(!mylist.isEmpty()){
        count=0;
      }
      s=10000;
      for(int i=0; i < mylist.size(); i++){
        if(mylist.get(i)==0){
          mylist.remove(i);
          i=i-1;
        }
      }     
    } 
  }
  }
