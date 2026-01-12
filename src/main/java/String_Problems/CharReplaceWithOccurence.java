package String_Problems;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharReplaceWithOccurence {
    public static void main(String[] args) {
        String word="aabbbbbrrtgyyhnnh";
        //Result : 225555522tg222222
        HashMap<Character,Integer>cc=new LinkedHashMap<>();
        for(char a:word.toCharArray()){
           /* if(cc.containsKey(a)){
                cc.put(a,(cc.get(a)+1));
            }else{
                cc.put(a,1);
            }*/
            cc.put(a,cc.getOrDefault(a,0)+1);
        }
        /*StringBuilder result=new StringBuilder();
        for(char a:word.toCharArray()){
            if(cc.get(a)>1){
                result.append(cc.get(a));
            }else{
                result.append(a);
            }
        }
        System.out.println("Desired string is : "+result);*/
        System.out.println(cc);

        StringBuilder sb= new StringBuilder();
        for(char b:word.toCharArray()){
            if(cc.get(b)>1){
                sb.append(cc.get(b));
            }else sb.append(b);
        }
        System.out.println(sb);
    }
}
