package Jan_Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class practice {
    public static void main(String[] args) {
        String a="vaibhav";
        Map<Character,Integer> lastSeen= new HashMap<>();
        int left=0,maxlengh=0,startIndex=0;
        for(int right=0;right<a.length();right++){
            char c=a.charAt(right);
            if(lastSeen.containsKey(c) && lastSeen.get(c)>=left){
                left=lastSeen.get(c)+1;
            }
            lastSeen.put(c,right);
            if(right-left+1>maxlengh){
                maxlengh=right-left+1;
                left=startIndex;
            }
        }
        System.out.println("Maximum length is : "+maxlengh);
        System.out.println("String is "+a.substring(startIndex,startIndex+maxlengh));

    }
}
