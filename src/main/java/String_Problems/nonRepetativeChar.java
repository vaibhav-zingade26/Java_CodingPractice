package String_Problems;

import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class nonRepetativeChar {
    static String usingCoreJava(String ab){
        String a=ab;
        String r="";
        for(int i=0;i<a.length();i++){
            boolean isRepetative=false;
            for(int j=0;j<a.length();j++){
                if(i!=j && a.charAt(i)==a.charAt(j)){
                    isRepetative=true;
                }
            }
            if(!isRepetative){
                r+=a.charAt(i);
            }
        }
        return r;
    }

    static String usingHashMap(String a){
        String s=a;
        HashMap<Character,Integer>cc=new LinkedHashMap<>();
        for(char b:s.toCharArray()){

                cc.put(b,cc.getOrDefault(b,0)+1);

        }
        System.out.println(cc);
        String result="";

        for(Map.Entry<Character,Integer> me:cc.entrySet()){
            if(me.getValue()==1){
                result+=me.getKey();
            }
        }
        return result;
    }



    public static void main(String[] args) {
        //String name="aabtggyhh";
       // System.out.println(usingCoreJava("aabtggyhh"));
        System.out.println(usingHashMap("aabtggyhh"));









    }
}
