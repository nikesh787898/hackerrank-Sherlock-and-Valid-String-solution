import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        Scanner sn = new Scanner(System.in);
        String str = sn.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i)) ==null){
                map.put(str.charAt(i),1);
            }
            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        int fre = 0 ;
        Iterator<Character> iter = map.keySet().iterator();
        int prev = -1;
        boolean flag = true;
        while(iter.hasNext()){
            char ch = iter.next();
            int count = map.get(ch);
            //System.out.println(ch + " " + count + " " + fre );
            if(prev == -1){
                prev = count;
            }
            else{
                if(prev!=count){
                    fre++;
                }
                if(fre >= 2){
                    flag = false;
                    break;
                }
            }
        }
        //System.out.println(fre);
        if(fre >= 2){
            flag = false;
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
