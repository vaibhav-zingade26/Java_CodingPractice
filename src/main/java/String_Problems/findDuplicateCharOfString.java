package String_Problems;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class findDuplicateCharOfString {
    public static void main(String[] args) {
        String input="ahuydhjjuyrj";
        HashMap<Character,Integer> cc=new LinkedHashMap<>();
        for(char a:input.toCharArray()){
            cc.put(a,(cc.getOrDefault(a,0)+1));
            }
        System.out.println(cc);
        System.out.print("Duplicate characters are : ");
        for(char b:cc.keySet()){
            if(cc.get(b)>1){
                System.out.print(b+" ");
            }
        }
    }
}
