package String_Problems;

public class StringBuffer_StringBuilderExa {
    public static void main(String[] args) {
        String b="abc";
        String c="abc";
        System.out.println(b.equals(c));

        c=c.concat("dvgh");
        System.out.println(c);
        System.out.println(b);

        System.out.println(b.equals(c));


        /////////////////////////////////
        StringBuilder sb= new StringBuilder("abc");
    }
}
