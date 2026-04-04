package April_Practise;

import org.testng.annotations.Test;

import java.util.*;

public class firstRepetativeChar {
    String name="zvaibhav";

    @Test
    public void usingIndexOf() {
        for(char a:name.toCharArray()){
            if(name.indexOf(a)!=name.lastIndexOf(a)){
                System.out.println("First repetative char is : "+a);
                break;
            }
        }

    }

    @Test
    public void usingHashMap(){
        HashMap<Character,Integer> occurence=new LinkedHashMap<>();
        for(char c:name.toCharArray()){
            occurence.put(c,occurence.getOrDefault(c,0)+1);
        }
        for(char b:occurence.keySet()){
            if(occurence.get(b)>1){
                System.out.println("First repetative char is : "+b);
                break;
            }
        }
    }


    @Test
    public void usingSet(){
       Set<Character> set= new HashSet<>();
       Set<Character> duplicate=new LinkedHashSet<>();

       for(char b:name.toCharArray()){
           if(!set.add(b)){
               duplicate.add(b);
           }
       }

       for(char a:name.toCharArray()){
           if(duplicate.contains(a)){
               System.out.println("First repetative char is : "+a);
               break;
           }
       }
    }
}
