package String_Problems;

public class String_StringBuilder_StringBuffer {

    public final void sum(int a,int b){
        System.out.println(a+b);
    }




    public static void main(String[] args) {
        String a="avaibhav";
        System.out.println(a.lastIndexOf("v")+" "+a.indexOf("v"));

        StringBuilder b=new StringBuilder("Buildeir");
        b.insert(2,'v');
        System.out.println(b);
        System.out.println(b.lastIndexOf("i"));

        StringBuffer sb= new StringBuffer("Buffer");
        System.out.println(sb.append(sb.subSequence(2,4)));


        /// ///////// equals and ==

        String name1="Raja";
        String name2="Raja";
        System.out.println(name1.equals(name2));
        System.out.println(name1==name2);
        System.out.println("-------------------");
        String x=new String("X");
        String y=new String(("X"));
        System.out.println(x.equals(y));
        System.out.println(x==y);


        final String v="String";







    }
}
