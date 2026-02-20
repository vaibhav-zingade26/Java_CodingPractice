package Jan_Practice;

import java.util.*;

public class FirstNonRepeatativeCharacter {

    public static void main(String[] args) {
        String a="abbcad";
        Map<Character,Integer>map=new LinkedHashMap<>();
        for(char b:a.toCharArray()){
            map.put(b,map.getOrDefault(b,0)+1);
        }
        for(char key:map.keySet()){
            if(map.get(key)==1){
                System.out.println("First no repetative char is "+key);
                break;
            }
        }
    }
}
