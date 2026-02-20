package Collections_Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_ {
    public static void main(String[] args) {
        //does not allow duplicate values and insertion orders not preserve
        Set<String>set= new HashSet<>();
        set.add("aa");
        set.add("dd");
        set.add("ii");
        set.add("oo");
        set.add("bb");
        set.add("cc");
        set.add("rr");
        set.add("tt");
        set.add("yy");
        System.out.println("************************");
        set.add("ss");
        set.add("ff");
        System.out.println(set);




    }
}
