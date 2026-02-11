package Feb_Prcatice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PrintNonRepetatativeChar {
    public static void main(String[] args) {
        String name="vaibhav";
        HashMap<Character,Integer>hp=new LinkedHashMap<>();
        for(char b:name.toCharArray()){
            hp.put(b,hp.getOrDefault(b,0)+1);
        }
        for(char c:hp.keySet()){
            if(hp.get(c)==1){
                System.out.print(c);
            }
        }
        System.out.println();
        System.out.println("**************************************");

        int[] arr=new int[256];
        for(char b:name.toCharArray()){
            arr[b]++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                System.out.print((char)i);
            }
        }
    }
}
