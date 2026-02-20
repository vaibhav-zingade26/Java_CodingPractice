package Collections_.List_;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("Vaibhav");
        list.add("dada");
        list.add("iyuh");
        list.add("ghjuj");
        System.out.println(list);
        /*System.out.println(list);
        list.addFirst("ghg");
        System.out.println(list);
        list.addLast("zinngdae");
        System.out.println(list);
        System.out.println(list.getFirst()*/

        list.add(2,"secondindex");
        System.out.println(list);




    }
}
