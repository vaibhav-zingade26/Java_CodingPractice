package Collections_Map;

import java.util.*;

public class Map_ {
    //it is stores the heterogenous data into key and values
    public static void main(String[] args) {
        Map<Object,Object> map = new HashMap();

        map.put("1213",7887);
        map.put(null,"terere");
        map.put(12129,"deje");

        System.out.println("HashMap is "+map);


        //Treemap : which stores key in sorted form

        Map<Integer,String> ab= new TreeMap<>();
        ab.put(6,"f4f");
        ab.put(199,"fr");
        ab.put(7,"fgetg4f");
        ab.put(8,"f4gtf");
        ab.put(null,"f4gtf");

        System.out.println("TreeMap is "+ab);


        //LinkedHashMap : which stores key in sorted form

        Map<Integer,String> linked = new LinkedHashMap<>();
        linked.put(24,"f4f");
        linked.put(43,"fr");
        linked.put(74,"fgetg4f");
        linked.put(82,"f4gtf");
        linked.put(null,"d32");

        System.out.println("LinkedHashMap is "+linked);






    }
}
