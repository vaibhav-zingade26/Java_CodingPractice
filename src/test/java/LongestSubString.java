import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubString {
    public static void main(String[] args) {
        String a="cwececbvjbjbjjvjjjjvjdvj";
        HashMap<Character,Integer> cc= new LinkedHashMap<>();
        for(char b:a.toCharArray()){
            cc.put(b,cc.getOrDefault(b,0)+1);
        }
        System.out.println(cc);

        String vowels="aeiou";
        HashMap<Character,Integer> result= new LinkedHashMap<>();
        for(char b:vowels.toCharArray()){
            if(cc.containsKey(b)){
                result.put(b,cc.get(b));
            }
        }
        for(char c:cc.keySet()){
            if(!vowels.contains(Character.toString(c))){
                result.put(c,cc.get(c));
            }
        }
        System.out.println(result);
    }
}
