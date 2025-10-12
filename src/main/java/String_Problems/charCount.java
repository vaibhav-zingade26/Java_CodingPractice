package String_Problems;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class charCount {
    public static void main(String[] args) {
        String name = "Vaibhav Chandrakant Zingade";
        name=name.toLowerCase();

        HashMap<Character,Integer> cc = new LinkedHashMap<>();
        for(char a:name.toCharArray()){
            if(a!=' '){
                if(cc.containsKey(a)){
                    cc.put(a,(cc.get(a)+1));
                }
                else {
                    cc.put(a,1);
                }
            }
        }
        String v="aeiouAEIOU";
        HashMap<Character,Integer> r = new LinkedHashMap<>();
        for(char a:v.toCharArray()){
            if(cc.containsKey(a)){
                r.put(a,cc.getOrDefault(a,0)+1);
            }
        }
        for(char a:cc.keySet()){
            if(!v.contains(Character.toString(a))){
                r.put(a,cc.get(a));
            }
        }
        System.out.println(r);

    }
}
