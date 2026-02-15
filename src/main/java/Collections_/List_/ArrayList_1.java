package Collections_.List_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_1 {

    public static void main(String[] args) {
        List<String>list= new ArrayList<>();
        list.add("D");
        list.add("C");
        list.add("B");
        list.add("A");
        System.out.println(list+" "+list.size());

        /*System.out.println(list.get(2));
        System.out.println(list.remove("123"));*/
        System.out.println(list+" "+list.size());
        /*System.out.println(list.set(2,"2345"));
        System.out.println(list+" "+list.size());*/

        Collections.shuffle(list);

        System.out.println("after sufflieng"+list);
        Collections.sort(list);

        System.out.println("After sorting "+list);




    }
}
