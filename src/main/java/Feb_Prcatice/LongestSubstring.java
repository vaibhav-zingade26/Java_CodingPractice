package Feb_Prcatice;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String name="abcabcd";
        HashMap<Character,Integer>lastSeeen= new HashMap<>();
        int left=0;
        int maxLength=0;
        int startIndex=0;
        for(int right=0;right<name.length();right++){
            char a=name.charAt(right);
            if(lastSeeen.containsKey(a) && lastSeeen.get(a)>=left){
                left=lastSeeen.get(a)+1;
            }
            lastSeeen.put(a,right);

            if(right-left+1>maxLength){
                maxLength=right-left+1;
                startIndex=left;
            }
        }
        System.out.println("Length of subString : "+maxLength);
        System.out.println("Substring is "+name.substring(startIndex,startIndex+maxLength));



    }
}
