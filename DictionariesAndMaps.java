import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer>friendsNumber = new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            friendsNumber.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(friendsNumber.containsKey(s)){
            System.out.println(s+"="+friendsNumber.get(s));
        }
        else{
          System.out.println("Not found");
        }
        }
        in.close();
    }
}
