package Jan_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class FirstNonRepeatativeCharacter {

    public static void main(String[] args) {
        String a="abbca";
        LinkedHashSet<Character>set= new LinkedHashSet<>();

       /* List<Character> list= new ArrayList<>();
        for(int right=0;right<a.length();right++){

            if(list.contains(a.charAt(right))){
                System.out.println(a.charAt(right));
                return;
            }
            list.add(a.charAt(right));
        }*/


        for(int right=0;right<a.length();right++){
            if(set.contains(a.charAt(right))){
                System.out.println(a.charAt(right));
                return;
            }
            set.add(a.charAt(right));

        }
    }
}
