package String_Problems;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String a="aabbhh";
        //need to store into LinkedHashset

        LinkedHashSet<Character> set= new LinkedHashSet<>();
        for(char b:a.toCharArray()){
            set.add(b);
        }

        //store into new string
        String result="";
        for(char c:set){
            result+=c;
        }
        System.out.println(result);
    }
}
