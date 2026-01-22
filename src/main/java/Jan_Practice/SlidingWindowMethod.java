package Jan_Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/// sliding window problem

public class SlidingWindowMethod {
    public static void main(String[] args) {
        String a="kuwefhwkef";
        HashMap<Character,Integer>lastSeen= new LinkedHashMap<>();
        int left=0,maxLength=0;int startIndex=0;
        for(int right=0;right<a.length();right++){
            char c=a.charAt(right);
            if(lastSeen.containsKey(c) && lastSeen.get(c)>=left){
                left=lastSeen.get(c)+1;
            }
            lastSeen.put(c,right);
            if(right-left+1>maxLength){
                maxLength=right-left+1;
                startIndex=left;
            }
        }
        System.out.println("MaxLenth is : "+maxLength);
        System.out.println("Longest string is :"+a.substring(startIndex,startIndex+maxLength));
    }
}
