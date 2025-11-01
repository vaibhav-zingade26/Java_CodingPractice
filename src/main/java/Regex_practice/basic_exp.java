package Regex_practice;

public class basic_exp {
    public static void main(String[] args) {
        String a = "abhabgdrrahhhhhabhgh2E345mk%$%^89";
        System.out.println(a.replaceAll(".", "X"));            //replce all chars with X
        System.out.println(a.replaceAll("^abhg", "Vaibhav"));  //replce if starts with this exp
        System.out.println(a.replaceAll("5mk$", "zingade"));   //replace if ends with this expression
        System.out.println(a.matches("^abhgdrrhhhhhabhgh2E345mk"));      //matches each and every chars if matches the returns true
        System.out.println(a.replaceAll("[ahr][b]", "@"));    //check pairs e.g ab,hb,rb and replace
        System.out.println(a.replaceAll("[ha2]", "*"));       // replace each chars with *
        System.out.println(a.replaceAll("[^ha2]", "*"));      //reaplace each chars except [ha] chars
        System.out.println(a.replaceAll("[^a-cA-C1-2]", "#")); //reaplace each chars except [ha] chars
        System.out.println(a.replaceAll("[a-cA-C1-2]", "R"));  // replace each chars with *
        System.out.println(a.replaceAll("(?i)[a-cA-C1-2]", "R"));  // replace each chars with *
        System.out.println(a.replaceAll("[0-9]", "i"));        //replace each integers with i
        System.out.println(a.replaceAll("\\d", "uu"));         //replace digits
        System.out.println(a.replaceAll("\\D", "e"));          //replace other than digits

    }

}
