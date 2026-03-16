package March_Oractise;

import java.util.HashMap;
import java.util.Map;

public class NonRepetative {
    public static void main(String[] args) {
        String name="aabcdd";
        StringBuilder sb= new StringBuilder();

        Map<Character,Integer> map=new HashMap<>();

        for(char b:name.toCharArray()){
            map.put(b,map.getOrDefault(b,0)+1);
        }

        for(char c:map.keySet()){
            if(map.get(c)==1){
                sb.append(c);
            }
        }
        System.out.println("Non repetative chars is "+sb);
    }

}
