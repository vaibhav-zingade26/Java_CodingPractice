package March_Oractise;

public class FirstNonRepetative {
    public static void main(String[] args) {
        String a="automation";
        for(char v:a.toCharArray()){
           if(a.indexOf(v)==a.lastIndexOf(v)){
               System.out.println("FFirstNonRepetative number is "+v);
               break;
           }
        }
    }
}
