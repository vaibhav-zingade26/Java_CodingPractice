package Collections_.List_;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList_1 {

    public static void main(String[] args) {
        List list= new ArrayList<>();
        list.add(123);
        list.add("C");
        list.add("B");
        list.add("A");
        System.out.println(list+" "+list.size());

        Iterator it=list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());

        }


        /*System.out.println(list.get(2));
        System.out.println(list.remove("123"));*/
        System.out.println(list+" "+list.size());
        /*System.out.println(list.set(2,"2345"));
        System.out.println(list+" "+list.size());*/

        Collections.shuffle(list);

        /*System.out.println("after sufflieng"+list);
        Collections.sort(list);

        System.out.println("After sorting "+list);

        list.sort(Collections.reverseOrder());
        System.out.println(list);*/

        System.out.println(list.contains("D"));






    }
}
