package Collections_Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset_ {
    public static void main(String[] args) {
        //A TreeSet is a collection that stores unique elements in sorted order.

        Set<String> set= new TreeSet<>();
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
