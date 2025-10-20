package String_Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String a="listen";
        String b="silent";
        char[] c=a.toCharArray();
        char [] d=b.toCharArray();

        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(d));

        Arrays.sort(c);
        Arrays.sort(d);

        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(d));
    }
}
