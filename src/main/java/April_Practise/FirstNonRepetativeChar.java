package April_Practise;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepetativeChar {
    String name="aabcbcde";

    @Test
    public void usingHashMap(){
        HashMap<Character,Integer>hp=new LinkedHashMap<>();
        for(char a:name.toCharArray()){
            hp.put(a,hp.getOrDefault(a,0)+1);
        }
        for(char b:hp.keySet()){
            if(hp.get(b)==1){
                System.out.println("First Non Repetative char is "+b);
                break;
            }
        }
    }

    @Test
    public void usingFreqArray(){

        int[] freq = new int[256];
            for (char a : name.toCharArray()) {
                freq[a]++;
            }
            for (int i = 0; i < 256; i++) {
                if(freq[i]==1){
                    System.out.println((char)i+" : "+freq[i]);
                    break;
                }
            }
        }
}
