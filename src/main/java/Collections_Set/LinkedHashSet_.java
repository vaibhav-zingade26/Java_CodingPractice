package Collections_Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_ {
    public static void main(String[] args) {
        //store unique values and preserve insertion orders
        Set<String> set= new LinkedHashSet<>();

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
