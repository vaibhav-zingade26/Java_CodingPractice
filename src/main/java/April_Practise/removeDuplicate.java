package April_Practise;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate {
    String name="programming65u56uythrhrythtyjtyj";

    @Test
    public void usingLinkedHashSet(){
        Set<Character> set=new LinkedHashSet<>();
        for(char b:name.toCharArray()){
            set.add(b);
        }
        System.out.println(set);
        StringBuilder sb=new StringBuilder();
        for(char b:set){
            sb.append(b);
        }
        System.out.println(sb);


    }
}
