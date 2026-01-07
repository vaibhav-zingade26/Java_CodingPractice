package Jan_Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HSBC_problem {
    public static void main(String[] args) {
        String given="Vaibhav Chandrakant Zingade";
        given=given.toLowerCase();
        HashMap<Character,Integer> hp= new HashMap<>();
        for(char a:given.toCharArray()){
            if(a!=' '){
                hp.put(a,hp.getOrDefault(a,0)+1);
            }
        }
        System.out.println(hp);

        //first duplicate number
        for(char b:hp.keySet()){
            if(hp.get(b)>1){
                System.out.println("First duplicate characte is "+b);
                break;
            }
        }

        //print first vowels and then consonenets

        String vowels="aeiou";
        HashMap<Character,Integer> result= new LinkedHashMap<>();
        for(char c:vowels.toCharArray()){
            if(hp.containsKey(c)){
                result.put(c,hp.get(c));
            }
        }

        for(char d:hp.keySet()){
            if(!vowels.contains(Character.toString(d))){
                result.put(d,hp.get(d));
            }
        }

        System.out.println(result);
    }
}
